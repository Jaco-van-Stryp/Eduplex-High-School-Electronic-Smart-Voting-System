//Class Created On 2018.08.30 By Jaco van Stryp
package com.Backend;

import com.MainData.MainNomination;
import com.MainData.Settings;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AutoRepair {

    String[] listOfNames = new String[400];
    int finalBigSize = 0;
    commonMethods cm = new commonMethods();

    public void saveNewUser(String fName, String sName, String picLocation, String grade, String gender) {

        PrintWriter printer = null;
        try {
            String tag = fName + "#" + sName + "#" + picLocation + "#" + grade + "#" + gender;
            printer = new PrintWriter(new FileWriter(cm.getDatabaseLocation() + "\\ImageSources.db", true));
            printer.println(tag);
            printer.close();
        } catch (IOException ex) {

        }
    }

    public String genCode(String fName, String sName, String grade, String location) {
        String code = UUID.randomUUID() + "";
        try {
            Connection myconObj;

            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);

            myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
            ResultSet result;

            String query = "Update UsersToVoteFor SET AutoRepairCode = " + code + " WHERE fName = '" + fName + "' AND sName = '" + sName + "' AND grade = '" + grade + "'";
            PreparedStatement add = myconObj.prepareStatement(query);
            add.executeUpdate();
            PrintWriter pw = new PrintWriter(new FileWriter(cm.getDatabaseLocation() + "\\AutoRepair.db", true));
            pw.println(code + "#" + location);
            pw.close();
            return code;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "";

    }

    public void autoNominate() {

        int total = 0;
        total += this.SmartNominate("8", "Boys");
        total += this.SmartNominate("8", "Girls");
        total += this.SmartNominate("9", "Boys");
        total += this.SmartNominate("9", "Girls");
        total += this.SmartNominate("10", "Boys");
        total += this.SmartNominate("10", "Girls");
        total += this.SmartNominate("11", "Boys");
        total += this.SmartNominate("11", "Girls");
        String names = "";
        for (int i = 0; i < listOfNames.length; i++) {
            if (listOfNames[i] == null) {

            } else {
                names += listOfNames[i] + "\n";
            }
        }
        if (total > 0) {
            this.showLongTextMessageInDialog(names + "\n\nSuccessfully Nominated " + total + " People", "Successfully Nominated " + total + " People");
            this.backupDatabase("StudentVotingData - Original Backup");
        } else {
            JOptionPane.showMessageDialog(null, "There was no one new to nominate");

        }

    }

    public void forceImageRepair() {

        try {
            int counter = 0;
            Connection myconObj;

            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);
            myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.databaseLocation + "\\StudentVotingData - Original Backup.accdb");

            ResultSet result;
            Statement stmt = myconObj.createStatement();
            String query = "select * from UsersToVoteFor";
            result = stmt.executeQuery(query);
            String[] backupFName = new String[300];
            String[] backupSName = new String[300];
            String[] backupLocation = new String[300];
            String[] backupGrade = new String[300];
            while (result.next()) {

                backupFName[counter] = result.getString("fName");
                backupSName[counter] = result.getString("sName");
                backupGrade[counter] = result.getString("Grade");
                backupLocation[counter] = result.getString("UserPictureLocation");

                counter++;
            }

            Connection myconObjOr;

            String driverNew = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driverNew);
            myconObjOr = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
            ResultSet resultNew;

            String queryNew;

            //CHANGED
            for (int i = 0; i < backupFName.length; i++) {
                if (backupFName[i] == null) {

                } else {

                    // System.out.println(backupLocation[i]);
                    queryNew = "UPDATE UsersToVoteFor SET UserPictureLocation = \"" + backupLocation[i] + "\" WHERE fName = \"" + backupFName[i] + "\" AND sName = \"" + backupSName[i] + "\" And Grade = \"" + backupGrade[i] + "\"";
                    System.out.println(queryNew);
                    PreparedStatement addMore = myconObjOr.prepareStatement(queryNew);
                    addMore = myconObjOr.prepareStatement(queryNew);
                    addMore.executeUpdate();
                }
            }

            //CHANGED
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No backup was found, Please ask a teacher to turn Images Off in Settings", "Uh Oh", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    public void backupDatabase(String name) {

        try {
            File dest;
            String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
            File source = new File(cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
            if (name.equalsIgnoreCase("default")) {
                dest = new File(cm.getDatabaseLocation() + "\\StudentVotingDataBackup - " + timeStamp + ".accdb");
            } else {
                dest = new File(cm.getDatabaseLocation() + "\\" + name + ".accdb");

            }

            Files.copy(source.toPath(), dest.toPath());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please remove the backup of the database from the backup folder so a new one can be created");
        }
    }
    
     public void backupSQLProcessing() {

        try {
            File dest;
            String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
            File source = new File(cm.getDatabaseLocation() + "\\SmartSQLProcessing");
           
            dest = new File(cm.getDatabaseLocation() + "\\SmartSQLProcessingBackup - " + timeStamp + "");

            
            
          copyFolder(source, dest);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please remove the backup of the database from the backup folder so a new one can be created");
        }
    }
    
   
      private static void copyFolder(File sourceFolder, File destinationFolder) throws IOException
    {
        //Check if sourceFolder is a directory or file
        //If sourceFolder is file; then copy the file directly to new location
        if (sourceFolder.isDirectory())
        {
            //Verify if destinationFolder is already present; If not then create it
            if (!destinationFolder.exists())
            {
                destinationFolder.mkdir();
                System.out.println("Directory created :: " + destinationFolder);
            }
             
            //Get all files from source directory
            String files[] = sourceFolder.list();
             
            //Iterate over all files and copy them to destinationFolder one by one
            for (String file : files)
            {
                File srcFile = new File(sourceFolder, file);
                File destFile = new File(destinationFolder, file);
                 
                //Recursive function call
                copyFolder(srcFile, destFile);
            }
        }
        else
        {
            //Copy the file content from one place to another
            Files.copy(sourceFolder.toPath(), destinationFolder.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied :: " + destinationFolder);
        }
    }

     
    MainNomination mn = new MainNomination();

    public int SmartNominate(String grade, String gender) {

        try {
            int size = 0;
            String OGrade = grade;
            String OGender;
            grade = "Grade " + grade;
            if (gender.equalsIgnoreCase("Girls")) {
                OGender = "f";
            } else {
                OGender = "m";
            }
            String location = cm.getDatabaseLocation() + "\\Pictures\\" + grade + "\\" + gender + "\\";

            File folder = new File(location);
            File[] listOfFiles = folder.listFiles();
            String name = "";
            String sName = "";

            Connection myconObj;
            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);

            myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
            ResultSet result;

            String query = "INSERT INTO UsersToVoteFor(fName, sName, Grade, Gender, UserPictureLocation) VALUES(?,?,?,?,?)";
            boolean overload = false;
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    try {
                        location = cm.getDatabaseLocation() + "\\Pictures\\" + grade + "\\" + gender + "\\" + listOfFiles[i].getName();

                        name = listOfFiles[i].getName();
                        name = name.substring(0, name.lastIndexOf('.'));
                        sName = name.substring(name.lastIndexOf(" ") + 1);
                        name = name.replaceAll(sName, "");
                        name = name.trim();
                        sName = sName.trim();

                        if (mn.hasUserBeenNominated(name, sName) == true) {

                        } else {
                            if (size >= 30) {
                                overload = true;
                            } else {
                                listOfNames[finalBigSize] = name + " " + sName + " in grade " + OGrade;
                                finalBigSize++;
                                PreparedStatement add = myconObj.prepareStatement(query);
                                add.setString(1, name);
                                add.setString(2, sName);
                                add.setString(3, OGrade);
                                add.setString(4, OGender);
                                add.setString(5, location);
                                this.saveNewUser(name, sName, location, OGrade, OGender);
                                size++;
                                // add.setString(6, this.genCode(name, sName, grade, location));

                                add.executeUpdate();
                            }
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }

            }
            if (overload == true) {
                JOptionPane.showMessageDialog(null, "There are more than 30 people in the " + grade + " " + gender + " group!\n\nThere can only be 30 people in this group!\nSome people have been skipped!", "Note", JOptionPane.WARNING_MESSAGE);
            }
            return size;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }
        return 0;
    }

    private void showLongTextMessageInDialog(String longMessage, String extraInfo) {
        JTextArea textArea = new JTextArea(6, 25);
        textArea.setText(longMessage);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(null, scrollPane, extraInfo, JOptionPane.INFORMATION_MESSAGE);
    }

    public void reloadOptimisedSystem() {
        try {
            PrintWriter printer = new PrintWriter(new FileWriter(cm.getDatabaseLocation() + "\\ImageSources.db"));

            Connection myconObj;

            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);
            myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
            ResultSet result;
            Statement stmt = myconObj.createStatement();

            String query = "";

            query = "SELECT * FROM UsersToVoteFor";

            result = stmt.executeQuery(query);
            String dbfName = "";
            String dbSurname = "";
            String dbGrade = "";
            String dbGender = "";
            String dbLocation = "";
            printer.print("");
            printer.close();
            while (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");
                dbGrade = result.getString("Grade");
                dbGender = result.getString("Gender");
                dbLocation = result.getString("UserPictureLocation");

                this.saveNewUser(dbfName, dbSurname, dbLocation, dbGrade, dbGender);
            }
            query = "SELECT * FROM UsersAlreadyVoted";

            ResultSet Newresult = stmt.executeQuery(query);
            dbfName = "";
            dbSurname = "";
            dbGrade = "";
            String dbVotedBefore = "";
            String time = "";
            printer.print("");
            printer.close();
            PrintWriter advSaver = new PrintWriter(new FileWriter(cm.getDatabaseLocation() + "\\AntiDoubleVote.db", false));
            while (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("Surname");
                dbGrade = result.getString("Grade");
                dbVotedBefore = result.getString("VotedBefore");
                time = result.getString("Time");
                advSaver.println(dbfName + "#" + dbSurname + "#" + dbGrade + "#" + dbVotedBefore + "#" + time);

            }
            advSaver.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    Settings sm = new Settings();

    public void saveSettingsToLocal() {
        try {

            PrintWriter printer = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\OverallSettings.db"));
            Scanner scFile = new Scanner(new File(cm.getDatabaseLocation() + "\\OverallSettings.db"));
            while(scFile.hasNextLine())
            {
                   printer.println(scFile.nextLine());
            }
            printer.close();
            scFile.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void saveOptimisedSystemToLocalStorage() //TODO
    {
        try {
            PrintWriter printer = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\ImageSources.db", false));
            Scanner scFile = new Scanner(new File(cm.getDatabaseLocation() + "\\ImageSources.db"));
            String[] dataArray = new String[350];
            int counter = 0;
            while (scFile.hasNextLine()) {
                dataArray[counter] = scFile.nextLine();
                counter++;

            }
           // JOptionPane.showMessageDialog(null, counter + " \n " + cm.getDatabaseLocation() + "\\ImageSources.db");
            if (sm.checkStatus("ForceRandomisedDisplay") == true) {
                Collections.shuffle(Arrays.asList(dataArray));
            }
            for(int i = 0; i < dataArray.length; i++) {
                if (dataArray[i] != null) {
                    printer.println(dataArray[i]);

                }
            }
            printer.close();
            scFile.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
