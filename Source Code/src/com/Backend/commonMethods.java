//Coded And Re-Optimised By Jaco Van Stryp Grade 12/2 (Information Technology PAT Phase 3)
//Date Started 03/20/2018
//Date Finished 05/29/2018
//Optimisation Methods To Speed Things Up Aswell As Database Information Was Obtained Via Youtube And Stackoverflow.
package com.Backend;
//Importing All Required Imports

import com.MainData.MultiVote;
import com.MainData.Settings;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//This Class will be used for methods that will be comonly used in other classes
//All Code will be set up to allow more than one computers to be connected to the  database
//The Database will not be "In Use" when one program is open.
public class commonMethods {  //Most Methods will be stored in here
    
    
    SmartEncryption se = new SmartEncryption();
    String schoolType = "Highschool"; // Sets The Way The Program Should Run, If This Changes, Little Other Code Needs To Change
    String databaseLocation = this.getDatabaseLocation(); //Gets The DB Location and saves it in this class to make sure the computer can access it

//There are 2 methods that returns the database location so that the user wont lose any information and all information gets correctly saved
    //to the database
    //These Strings are used to store and send information through classes that is required for the program to function correctly
    String g8B = "B";
    String g8G = "B";
    String g9B = "B";
    String g9G = "B";
    String g10B = "B";
    String g10G = "B";
    String g11B = "B";
    String g11G = "B";
    String gTG = "B";
    String gTB = "B";

    //VOTE 2  
    String g8Bv2 = "B";
    String g8Gv2 = "B";
    String g9Bv2 = "B";
    String g9Gv2 = "B";
    String g10Bv2 = "B";
    String g10Gv2 = "B";
    String g11Bv2 = "B";
    String g11Gv2 = "B";
    String gTGv2 = "B";
    String gTBv2 = "B";

    String line = "";

    public  String softwareVersion = "12.2019.07.25";

    public String getSoftWareActiveVersion() {

        String softwareActiveVersion = softwareVersion; // Initialise Software Version 

        return softwareActiveVersion;
    }

    public commonMethods() { //This constructor is used to load all the information when the "window" opens so that the program can run as smooth
        //and fast as the computer it's on will allow it to.
        try {
            PrintWriter printerSmartSQL = new PrintWriter(new FileWriter(databaseLocation + "\\SmartSQLProcessing.db", true));
            printerSmartSQL.print("");
            printerSmartSQL.close();
            System.out.println(this.getDatabaseLocation() + "\\Settings.db");
            Scanner scLine = new Scanner(new File(this.getDatabaseLocation() + "\\Settings.db")).useDelimiter("#");
            //used to get the Settings file's information and validate it.
            /*    PrintWriter printer = new PrintWriter(new FileWriter(this.getDatabaseLocation() + "\\antiOverloadMaxConnections.db", true));
            printer.print("");
            printer.close();

            PrintWriter printerV2 = new PrintWriter(new FileWriter(this.getDatabaseLocation() + "\\antiOverloadConnections.db", true));
            printerV2.print("");
            printerV2.close();
             */
            System.out.println(scLine.next());
            g8B = scLine.next();
            System.out.println(scLine.next());
            g8G = scLine.next();
            System.out.println(scLine.next());
            g9B = scLine.next();
            System.out.println(scLine.next());
            g9G = scLine.next();
            System.out.println(scLine.next());
            g10B = scLine.next();
            System.out.println(scLine.next());
            g10G = scLine.next();
            System.out.println(scLine.next());
            g11B = scLine.next();
            System.out.println(scLine.next());
            g11G = scLine.next();
             System.out.println(scLine.next());
            gTB = scLine.next();
             System.out.println(scLine.next());
            gTG = scLine.next();

            Scanner scLineV2 = new Scanner(new File(this.getDatabaseLocation() + "\\SettingsV2.db")).useDelimiter("#");
            //used to get the Settings file's information and validate it.

            System.out.println(scLineV2.next());
            g8Bv2 = scLineV2.next();
            System.out.println(scLineV2.next());
            g8Gv2 = scLineV2.next();
            System.out.println(scLineV2.next());
            g9Bv2 = scLineV2.next();
            System.out.println(scLineV2.next());
            g9Gv2 = scLineV2.next();
            System.out.println(scLineV2.next());
            g10Bv2 = scLineV2.next();
            System.out.println(scLineV2.next());
            g10Gv2 = scLineV2.next();
            System.out.println(scLineV2.next());
            g11Bv2 = scLineV2.next();
            System.out.println(scLineV2.next());
            g11Gv2 = scLineV2.next();
              System.out.println(scLineV2.next());
            gTBv2 = scLineV2.next();
             System.out.println(scLineV2.next());
            gTGv2 = scLineV2.next();
            this.readySqlSmartProcessing();
             
         
        } catch (Exception e) {//This will tell the user there is a problem with the settings file
            JOptionPane.showMessageDialog(null, "Unable to locate Settings File");
            e.printStackTrace();
        }
    }
    
      public void readySqlSmartProcessing()
    {
        try{
            
               PrintWriter printNewData = new PrintWriter(new FileWriter(this.getDatabaseLocation() + "\\ImageSources.db", true));
               printNewData.print("");
               printNewData.close();
        } catch(Exception e)
        {
            
        }
         String path = this.getDatabaseLocation() + File.separator + "SmartSQLProcessing";
            File customDir = new File(path);

            if (customDir.exists()) {
             //   System.out.println(customDir + " already exists");
            } else if (customDir.mkdirs()) {
                try {
                    Runtime.getRuntime().exec("attrib +h \"" + customDir + "\""); //This Will Attempt To Hide The File
                } catch (IOException e) {

                }
                System.out.println(customDir + " was created");

            } else {
                System.out.println(customDir + " was not created");
                JOptionPane.showMessageDialog(null, "Could not create files to local directories\n\nPlease make sure this computer has appropriate permisions to create folders in\n\n'Documents'");
            }
            
            
           
    }

    public void checkForUpdate() {
        //Not Working
        try {
            URL oracle = new URL("https://gist.githubusercontent.com/jacovanstryp1/667e6d9afbcde7d583b1a9e0538e1c45/raw/f556491bd17b879cc6fd3566d0029b83be60c838/latest_version_sms");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(oracle.openStream()));
            String newestVersion = "";
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                newestVersion = inputLine;
            }
            if (softwareVersion.equalsIgnoreCase(newestVersion)) {
            } else {
                JOptionPane.showMessageDialog(null, "Updates Found!\n\nYou are running version " + softwareVersion + "\nThe newest version is " + newestVersion);
            }
            in.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String getSchoolType() {
        return schoolType; //Will return the type of school that the program should be working with so minimal changes can be made
        //if changing to a primary shcool
    }

    public String getDatabaseLocation() { // this method will check if the database location does exists and then return the location of it
        //The user will be prompted if that location does not exist!

        try {
            this.CheckIfDatabaseLocationExcists();
            Scanner scFile = new Scanner(new File(this.getLocalStorageLocation() + "\\dbLocation.db"));
            return scFile.nextLine();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "";

    }

    public String getActiveUserName() { //When some one votes, This will return the firstname stored in a .db file (so no one can easaly open it) 
        //and return the name of who had just logged in
        try {

            Scanner scFile = new Scanner(new File(this.getLocalStorageLocation() + "\\ActiveUser.db")).useDelimiter("#");
            String name = scFile.next();
            scFile.close();
            return name;
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Unable to locate ActiveUser"); // this will tell the user if that file failed to create or was deleted
            //within opperation of the program.
        }
        return null;
    }

    public String getActiveUserSurname() {//When some one votes, This will return the surname stored in a .db file (so no one can easaly open it) 
        //and return the name of who had just logged in
        try {
            Scanner scFile = new Scanner(new File(this.getLocalStorageLocation() + "\\ActiveUser.db")).useDelimiter("#");
            String surname = "";
            surname = scFile.next();
            surname = scFile.next();
            return surname;
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Unable to locate ActiveUser");
        }
        return null;
    }

    public boolean hasUserVoted(String fName, String sName) { //this method will check if the person has already voted or not and return TRUE or FALSE
        //based on what the database returns
        //FIXTHISPLEASE

        Settings sm = new Settings();

        try {

            PrintWriter optimiser = new PrintWriter(new FileWriter(this.getDatabaseLocation() + "\\AntiDoubleVote.db", true));
            optimiser.print("");
            optimiser.close();
            Scanner scFile = new Scanner(new File(this.getDatabaseLocation() + "\\AntiDoubleVote.db"));
            int saveCounter = 0;
            while (scFile.hasNextLine()) {
                String line = scFile.nextLine();
                line = se.decrypt(line);
                Scanner scLine = new Scanner(line).useDelimiter("#");
                String firstName, surname, grade, votedBefore, time;
                firstName = scLine.next();
                surname = scLine.next();
                grade = scLine.next();
                votedBefore = scLine.next();
                time = scLine.next();
                saveCounter++;

                if (fName.equalsIgnoreCase(firstName) && (surname.equalsIgnoreCase(sName))) {
                    return true;
                } else {
                    PrintWriter printer = new PrintWriter(new FileWriter(this.getLocalStorageLocation() + "\\ActiveUser.db")); //sets active user in external file
                    printer.println(fName + "#" + sName + "#USERIDENTITY");
                    printer.close();

                }
            }
            if (saveCounter == 0) {
                PrintWriter printer = new PrintWriter(new FileWriter(this.getLocalStorageLocation() + "\\ActiveUser.db"));
                printer.println(fName + "#" + sName + "#USERIDENTITY");
                printer.close();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    public void addToVoteList(String grade, String fName, String sName) { // this method will add the user to the vote list preventing them from voting again

        try {
            this.addToOptimisedVoteList(grade, fName, sName);

            Settings sm = new Settings();
            boolean testMode = sm.checkStatus("TestMode");

            if (testMode == true) {
                sName = sName + " - [Test Mode]";
            }
            PrintWriter printer = new PrintWriter(new FileWriter(this.getLocalStorageLocation() + "\\OldUser.db", true));

            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd - HH:mm:ss");
            Calendar cal = Calendar.getInstance();

            Scanner oldUserName = new Scanner(new File(this.getLocalStorageLocation() + "\\OldUser.db"));
            String oldName = "";

            if (oldUserName.hasNext()) {
                if (testMode == false) {
                    oldName = oldUserName.nextLine();
                }

            }
                     SmartSQLProcessing ssqlp = new SmartSQLProcessing();
            ssqlp.addSqlStatement("insert", "INSERT INTO UsersAlreadyVoted(fName, Surname, Grade, VotedBefore, CurrentTime) VALUES(\"" + fName + "\",\"" + sName + "\",\"" + grade + "\",\"" + oldName + "\", \"" + dateFormat.format(cal.getTime()) + "\")");
            
            //be stolen without the user having administration access

            System.out.println("User Successfuly Added to voting list");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error has occured"); //notifies user if something went wrong with the database
            e.printStackTrace();

        }

    }

    public void loadUserInstructions(String grade) { // this will load the settings file and tell the user how much people they can vote for on
        //what gender and grade type

        try {

            PrintWriter gradeSave = new PrintWriter(new FileWriter(this.getLocalStorageLocation() + "\\userGrade.db"));
            gradeSave.println(grade);
            System.out.println("Grade Code \"" + grade + "\"");
            String extraInfo = "";
            String extraextraInfo = "\n\n Please Be Patient If The Computer Is A Bit Slow\nPlease Do Not Click More Than Once On A Button That Indicates The Next Page!";

            boolean secondVote = this.hasSecondVote(grade);
            if (secondVote == true) {
                JOptionPane.showMessageDialog(null, "Please Note\n\nYou will Vote Twice\n\nThe First vote will be Grade " + this.getFirstVote(grade) + " ( " + this.getGradeData(grade, "b", "1") + " Boy(s) and " + this.getGradeData(grade, "f", "1") + " Girl(s) )" + "\nThe Second vote will be Grade " + this.getSecondVote(grade) + " ( " + this.getGradeData(grade, "b", "2") + " Boy(s) and " + this.getGradeData(grade, "f", "2") + " Girl(s) )" + "\n\nNote That The Second Vote Will Be For The Head Leaders\n\nWhen You Done Please Leave The Room\n\nClick On \"Ok\" To Start Voting" + "" + extraInfo);
            } else {

                if (grade.equalsIgnoreCase("8")) {
                    JOptionPane.showMessageDialog(null, "Please Note\n\nYou can vote for " + g8B + " Boys and " + g8G + " Girls\n\nWhen you are done voting, Please leave the room. \n\nClick On \"Ok\" To Start Voting" + extraInfo);
                } else if (grade.equalsIgnoreCase("9")) {
                    JOptionPane.showMessageDialog(null, "Please Note\n\nYou can vote for " + g9B + " Boys and " + g9G + " Girls\n\nWhen you are done voting, Please leave the room. \n\nClick On \"Ok\" To Start Voting" + extraInfo);

                } else if (grade.equalsIgnoreCase("10")) {
                    JOptionPane.showMessageDialog(null, "Please Note\n\nYou can vote for " + g10B + " Boys and " + g10G + " Girls\n\nWhen you are done voting, Please leave the room. \n\nClick On \"Ok\" To Start Voting" + extraInfo);

                } else if (grade.equalsIgnoreCase("11")) {
                    JOptionPane.showMessageDialog(null, "Please Note\n\nYou can vote for " + g11B + " Boys and " + g11G + " Girls\n\nWhen you are done voting, Please leave the room. \n\nClick On \"Ok\" To Start Voting" + extraInfo);

                } else if (grade.equalsIgnoreCase("12")) {
                    JOptionPane.showMessageDialog(null, "Please Note\n\nYou can vote for " + g11B + " Boys and " + g11G + " Girls\n\nWhen you are done voting, Please leave the room. \n\nClick On \"Ok\" To Start Voting" + extraInfo);

                } else if (grade.equalsIgnoreCase("teacher")) {

                    JOptionPane.showMessageDialog(null, "Please Note\n\nYou can vote for " + gTB + " Boys and " + gTG + " Girls\n\nWhen you are done voting, Please leave the room. \n\nClick On \"Ok\" To Start Voting" + extraInfo);
                }
            }
            gradeSave.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error has occured");

        }

    }

    public String getGradeData(String grade, String gender, String vote) { // returns information based on the grade and gender for other classes to use
        //and to require less input from the user, the program tries to do as much as possable as fast as possable
        //so the user can effeciently and quickly complete the action, providing a better opperation than voting on papers
        if (vote.equalsIgnoreCase("1")) {

            if (grade.equalsIgnoreCase("8")) {
                if (gender.equalsIgnoreCase("b")) {
                    return g8B;
                } else if (gender.equalsIgnoreCase("g") || gender.equalsIgnoreCase("f")) {
                    return g8G;
                }
            }
            if (grade.equalsIgnoreCase("9")) {
                if (gender.equalsIgnoreCase("b")) {
                    return g9B;
                } else if (gender.equalsIgnoreCase("g") || gender.equalsIgnoreCase("f")) {
                    return g9G;
                }
            }
            if (grade.equalsIgnoreCase("10")) {
                if (gender.equalsIgnoreCase("b")) {
                    return g10B;
                } else if (gender.equalsIgnoreCase("g") || gender.equalsIgnoreCase("f")) {
                    return g10G;
                }
            }
            if (grade.equalsIgnoreCase("11")) {
                if (gender.equalsIgnoreCase("b")) {
                    return g11B;
                } else if (gender.equalsIgnoreCase("g") || gender.equalsIgnoreCase("f")) {
                    return g11G;
                }

            }
            if (grade.equalsIgnoreCase("12")) {
                if (gender.equalsIgnoreCase("b")) {
                    return g11B;
                } else if (gender.equalsIgnoreCase("g") || gender.equalsIgnoreCase("f")) {
                    return g11G;
                }
            }
            if (grade.equalsIgnoreCase("teacher")) {
                if (gender.equalsIgnoreCase("b")) {
                    return gTB;
                } else if (gender.equalsIgnoreCase("g") || gender.equalsIgnoreCase("f")) {
                    return gTG;
                    //NEW
                }
            }
        } else if (vote.equalsIgnoreCase("2")) {
            if (grade.equalsIgnoreCase("8")) {
                if (gender.equalsIgnoreCase("b")) {
                    return g8Bv2;
                } else if (gender.equalsIgnoreCase("g") || gender.equalsIgnoreCase("f")) {
                    return g8Gv2;
                }
            }
            if (grade.equalsIgnoreCase("9")) {
                if (gender.equalsIgnoreCase("b")) {
                    return g9Bv2;
                } else if (gender.equalsIgnoreCase("g") || gender.equalsIgnoreCase("f")) {
                    return g9Gv2;
                }
            }
            if (grade.equalsIgnoreCase("10")) {
                if (gender.equalsIgnoreCase("b")) {
                    return g10Bv2;
                } else if (gender.equalsIgnoreCase("g") || gender.equalsIgnoreCase("f")) {
                    return g10Gv2;
                }
            }
            if (grade.equalsIgnoreCase("11")) {
                if (gender.equalsIgnoreCase("b")) {
                    return g11Bv2;
                } else if (gender.equalsIgnoreCase("g") || gender.equalsIgnoreCase("f")) {
                    return g11Gv2;
                }

            }
            if (grade.equalsIgnoreCase("12")) {
                if (gender.equalsIgnoreCase("b")) {
                    return g11Bv2;
                } else if (gender.equalsIgnoreCase("g") || gender.equalsIgnoreCase("f")) {
                    return g11Gv2;
                }
            }
            if (grade.equalsIgnoreCase("teacher")) {
                if (gender.equalsIgnoreCase("b")) {
                    return gTBv2;
                } else if (gender.equalsIgnoreCase("g") || gender.equalsIgnoreCase("f")) {
                    return gTGv2;
                    //NEW
                }
            }
        }
        return "%ERROR%";

    }

    public String loadGradeData() { // returns the grade the user is currently logged into so that correct information can be provided when
        //the user is voting
        try {
            Scanner scFile = new Scanner(new File(this.getLocalStorageLocation() + "\\userGrade.db"));
            String grade = scFile.next();
            return grade;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void submitPossableSuspect(String fName, String sName, String grade, String explenation) {
        //this is an easy way to submit data of users who may be trying to bypass the protection system in place
        //the administrations will be able to view this and know who to punish if data has gone missing or 
        //changed without it needing to change!
        try {
            java.net.InetAddress localMachine = java.net.InetAddress.getLocalHost();
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd - HH:mm:ss");
            Calendar cal = Calendar.getInstance();

                        SmartSQLProcessing ssqlp = new SmartSQLProcessing();
            ssqlp.addSqlStatement("insert", "INSERT INTO SuspiciousLoginAttempts(fName, Surname,Grade, Explination, ComputerIP, CurrentTime, MachineName) VALUES(\"" + fName + "\",\"" + sName + "\",\"" + grade + "\",\"" + explenation + "\", \"" + InetAddress.getLocalHost().getHostAddress() + "\",\"" + dateFormat.format(cal.getTime()) + "\",\"" + localMachine.getHostName() + "\")");
/*
            String query = "INSERT INTO SuspiciousLoginAttempts(fName, Surname,Grade, Explination, ComputerIP, Time, MachineName) VALUES(?,?,?, ?, ?, ?, ?)";

                                                        PreparedStatement add = myconObj.prepareStatement(query);
                                                  /*      add.setString(1, fName);
                                                        add.setString(2, sName);
                                                        add.setString(3, grade);
                                                        add.setString(4, explenation);
                                                        add.setString(5, InetAddress.getLocalHost().getHostAddress());
                                                        add.setString(6, dateFormat.format(cal.getTime()));
                                                        add.setString(7, localMachine.getHostName());

            add.executeUpdate();
*/
            System.out.println("User Successfuly Added to Suspicious List");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error has occured");

        }
    }

    public void addIPToAdminitrationAccess(String ip) { //this will allow the ip submited to have access to all administration 
        //controlls (This is how you set a computer as an administrator)
        try {
            System.out.println(ip);
            if (ip.equalsIgnoreCase("") || (ip.equalsIgnoreCase(null)) || (ip.equalsIgnoreCase("null"))) {

            } else {

                try {
                    SmartSQLProcessing ssqlp = new SmartSQLProcessing();
                    ssqlp.addSqlStatement("INSERT", "INSERT INTO IPAdministrationAllowed(IPAddress) VALUES(" + "\"" + ip + "\"" + ")");
                    PrintWriter printer = new PrintWriter(new FileWriter(this.getDatabaseLocation() + "\\IPAdministrationAllowed.db", true));
                    String value = se.encrypt(ip);
                    printer.println(value);
                    printer.close();
                    JOptionPane.showMessageDialog(null, ip + " Has successfuly been added as an Administration account");
                    System.out.println("User Successfuly Added to Administration List");
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        } catch (Exception e) {

        }
    }

    public boolean doesUserIPHaveAdministrationAccess() { //returnes TRUE or FALSE based on if the user does have administration access or not
        try {
             PrintWriter printer = new PrintWriter(new FileWriter(this.getDatabaseLocation() + "\\IPAdministrationAllowed.db", true));
                    printer.print("");
                    printer.close();
            Scanner scFile = new Scanner(new File(this.getDatabaseLocation() + "\\IPAdministrationAllowed.db"));
          

            while (scFile.hasNextLine()) {
                String dbIP = scFile.nextLine();
                dbIP = se.decrypt(dbIP);
                String genActiveIP = InetAddress.getLocalHost().getHostAddress();

                if (genActiveIP.equalsIgnoreCase(dbIP)) {
                    System.out.println("Ip has administration Access");
                    return true;
                } else {

                    System.out.println("Ip not found");

                }
            }
            scFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean checkIfAdminAccessIsEmpty() { // if no IP has been alocated as having administration access, this method will return FALSE
        //if they do it will return TRUE

       try {
             
            Scanner scFile = new Scanner(new File(this.getDatabaseLocation() + "\\IPAdministrationAllowed.db"));
          

            if(scFile.hasNextLine()) {
                       

               return false;
            }
            else
            {
               
            }
            scFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public void CheckIfDatabaseLocationExcists() { // makes sure the location of the database is as the user first entered when setting 
        //up the program, if not they will repeatedly be prompted to enter the correct address to where the program can read and write!
        System.out.println("\n\nData From Main Directory has been requested or tested\n\n");
     
        try {
           
            String path = System.getProperty("user.home") + File.separator + "Documents";
            path += File.separator + "EduplexHighSchoolEVS";
            File customDir = new File(path);
            System.out.println(path);
            if (customDir.exists()) {
                System.out.println(customDir + " already exists");
            } else if (customDir.mkdirs()) {
                try {
                    Runtime.getRuntime().exec("attrib +h \"" + customDir + "\""); //This Will Attempt To Hide The File
                } catch (IOException e) {

                }
                System.out.println(customDir + " was created");

            } else {
                System.out.println(customDir + " was not created");
                JOptionPane.showMessageDialog(null, "Could not create files to local directories\n\nPlease make sure this computer has appropriate permisions to create folders in\n\n'Documents'");
            }

            boolean found = false;

            while (found == false) {

                PrintWriter printMain = new PrintWriter(new FileWriter(this.getLocalStorageLocation() + "\\dbLocation.db", true));
                printMain.print("");
                printMain.close();

                String location = "";
                Scanner scConstruct = new Scanner(new File(this.getLocalStorageLocation() + "\\dbLocation.db"));
                while (scConstruct.hasNextLine()) {
                    location = (scConstruct.nextLine());
                }
                Scanner scFile = new Scanner(new File(this.getLocalStorageLocation() + "\\dbLocation.db"));

                String corDir = "l";

                if (scFile.hasNextLine()) {
                    String sDir = location;

                    File f1 = new File(sDir + "\\StudentVotingData.accdb");
                    File f2 = new File(sDir + "\\Settings.db");
                    File f3 = new File(sDir + "\\SettingsV2.db");

                    if (f1.isFile() && f2.isFile() && f3.isFile()) {

                        try {
                            PrintWriter accessTester = new PrintWriter(new FileWriter(f2, true));
                            accessTester.print("");
                            accessTester.close();
                            found = true;
                        } catch (Exception e) {
                            found = false;
                            JOptionPane.showMessageDialog(null, "This location does NOT have read access\n\nMake sure the file does not contain whitespaces and all users can read and write to this location!");
                            PrintWriter printMainNew = new PrintWriter(new FileWriter(this.getLocalStorageLocation() + "\\dbLocation.db", false));
                            printMainNew.print("");
                            printMainNew.close();
                        }

                    } else {
                        PrintWriter reWriter = new PrintWriter(new FileWriter(this.getLocalStorageLocation() + "\\dbLocation.db", false));
                        corDir = JOptionPane.showInputDialog("Lets get you set up right!\n\nPlease take the 2 files that came with the instalation\nThey will be called StudentVotingData.accdb And Settings.db\n\nMOVE those 2 files on a server that all users of\nthis program will have READ and WRITE access to\n\nWhen you are done\nEnter the directory of where BOTH these files are stored\n\nmake sure of your spelling\n\nIf the program can't find it\nIt will display this message again.\n\nThe Address Might not be writable/readable by the program if the files does exists in the directory!");
                        reWriter.print(corDir);
                        reWriter.close();

                    }

                } else {
                    PrintWriter reWriter = new PrintWriter(new FileWriter(this.getLocalStorageLocation() + "\\dbLocation.db", false));

                    corDir = JOptionPane.showInputDialog("Lets get you set up right!\n\nPlease take the 2 files that came with the instalation\nThey will be called StudentVotingData.accdb And Settings.db\n\nMOVE those 2 files on a server that all users of\nthis program will have READ and WRITE access to\n\nWhen you are done\nEnter the directory of where BOTH these files are stored\n\nmake sure of your spelling\n\nIf the program can't find it\nIt will display this message again.\n\nThe Address Might not be writable/readable by the program if the files does exists in the directory!");
                    reWriter.print(corDir);
                    reWriter.close();

                }
                if (corDir.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "No information was entered, the program will now close, please re-open it to try again");
                    System.exit(0);
                }
                printMain.close();
                scFile.close();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "No information was entered, the program will now close, please re-open it to try again");
            System.exit(0);

        }
    }

    public String getPictureLocation(String fName, String sName) {
        try {
            //New optimised code
            System.err.println("Option 1");

            String readName = "";
            String readSurname = "";
            String location = "";

            Scanner scFile = new Scanner(new File(this.getLocalStorageLocation() + "\\ImageSources.db"));
            while (scFile.hasNextLine()) {
                String line = scFile.nextLine();
                Scanner scLine = new Scanner(line).useDelimiter("#");
                readName = scLine.next();
                readSurname = scLine.next();
                location = scLine.next();
                if (readName.equalsIgnoreCase(fName) && readSurname.equalsIgnoreCase(sName)) {
                    return location;
                }

            }
            scFile.close();

            //Removing old code

        } catch (Exception e) {
            e.printStackTrace();

            System.err.println("Option 2");
            try {

                System.err.println("System One Failed\n\nAttempting To load System 2");

                Connection myconObj; // states connection with the database

                String driver = "net.ucanaccess.jdbc.UcanaccessDriver"; // states Driver
                Class.forName(driver); // loads driver

                myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + databaseLocation + "\\StudentVotingData.accdb"); //loads location of database
                ResultSet result;
                Statement stmt = myconObj.createStatement();
                String query = "select * from UsersToVoteFor"; //sql query that will be executed
                result = stmt.executeQuery(query);
                int saveCounter = 0;
                while (result.next()) { // loads and compates the name and surname with existing entries in the database
                    saveCounter++;
                    String dbfName = result.getString("fName");
                    String dbSurname = result.getString("sName");
                    String dbUserPictureLocation = result.getString("UserPictureLocation");

                    System.out.println(dbfName + " " + dbSurname + " Testing with " + fName + " " + sName);
                    if (fName.equalsIgnoreCase(dbfName) && (dbSurname.equalsIgnoreCase(sName))) {
                        System.out.println(fName + dbfName + " " + sName + dbSurname + " TESTING THIS OPTION");
                        System.out.println("User Already exists");

                        File f = new File(dbUserPictureLocation);
                        if (f.exists() && !f.isDirectory()) {
                            return dbUserPictureLocation;
                        }

                    } else {

                        System.out.println("User does not Already exists");
                        System.out.println(fName + dbfName + " " + sName + dbSurname + dbUserPictureLocation + " TESTING THIS OPTION");

                    }
                }
                if (saveCounter == 0) {

                    System.out.println("User does not Already exists");
                }
            } catch (Exception ex) {
                AutoRepair ar = new AutoRepair();
                ar.forceImageRepair();

            }

        }
        return "NoImageSet";

    }

    public ImageIcon resize(ImageIcon imageIcon, int width, int height) {
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(imageIcon.getImage(), 0, 0, width, height, null);
        g2d.dispose();
        return new ImageIcon(bi);
    }

    public int getTextColour(int value) {
        try {
// checks the status of a field in a database to easaly check if settings are true or false

            Connection myconObj;

            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);

            myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + this.getDatabaseLocation() + "\\StudentVotingData.accdb");
            ResultSet result;
            Statement stmt = myconObj.createStatement();
            String query = "select * from tblSettings WHERE schoolType = '" + this.getSchoolType() + "'";
            result = stmt.executeQuery(query);

            while (result.next()) {
                System.out.println("RETURNING ColourCodeForTextV" + value);
                return Integer.parseInt(result.getString("ColourCodeForTextV" + value));

            }

        } catch (Exception ex) {
            System.out.println("RETURNING DEFAULT");

            return 0;

        }

        return 0;
    }

    public String getLocalStorageLocation() {
        String path = System.getProperty("user.home") + File.separator + "Documents";
        path += File.separator + "";
        return path;
    }

    public void saveToSmartDisplay(String fullName) {

        try {
            PrintWriter printer = new PrintWriter(new FileWriter(this.getDatabaseLocation() + "\\smartDisplayLastUser.db", true));

            Settings sm = new Settings();
            if (sm.checkStatus("PromptedUsersToDisplayName") == true) {

                int dialogResult = JOptionPane.showConfirmDialog(null, "Hey There " + fullName + "\n\nTo Add A Little Fun...\nDo You Wish To Have Your Name Displayed On The Screen?\n\nNo One Will See Who You Voted For!\n\nThis Is What It Will Look Like:\n\nThank You\n\n[ ! ]   " + fullName + "   [ ! ]\n\nFor Voting", "Do You Want Your Name Shown On The Screen?", 0);

                if (dialogResult == 0) {
                    if (fullName.equalsIgnoreCase("Jaco Van Stryp") || fullName.equalsIgnoreCase("Luc Jacobs") || fullName.equalsIgnoreCase("Isipho Kave") || fullName.equalsIgnoreCase("Bryan-Luc Brink") || fullName.equalsIgnoreCase("Liesl Krause")) { //Special Characters For Grade 12 IT Students/Teacher
                        fullName = "- [ X ] -  " + fullName + "  - [ X ] -";
                    } else {
                        fullName = "[!]   " + fullName + "   [!]";
                    }
                    printer.println(fullName);

                }

            } else {
                if (fullName.equalsIgnoreCase("Jaco Van Stryp") || fullName.equalsIgnoreCase("Luc Jacobs") || fullName.equalsIgnoreCase("Isipho Kave") || fullName.equalsIgnoreCase("Bryan-Luc Brink") || fullName.equalsIgnoreCase("Liesl Krause")) { //Special Characters For Grade 12 IT Students/Teacher
                    fullName = "- [ X ] -  " + fullName + "  - [ X ] -";
                } else {
                    fullName = "[!]   " + fullName + "   [!]";
                }
                printer.println(fullName);

            }

            printer.close();
        } catch (Exception ex) {

        }

    }
    public String logoWebsite = "www.eduplex.co.za";

    public void requestSuspCheck() {
        int setAsAdministrator = 1;
        if (this.checkIfAdminAccessIsEmpty() == true) {

        } else if (setAsAdministrator != 0) {

            try {
                java.net.InetAddress localMachine = java.net.InetAddress.getLocalHost();
                String fName, sName;
                String grade = "";
                String activeUserName = System.getProperty("user.name");
               
            } catch (Exception ex) {

            }

        }
    }

    public String getFirstVote(String grade) {

        MultiVote mv = new MultiVote();
        return mv.getMultiVoteSettings(grade, "VoteOneGrade");
    }

    public String getSecondVote(String grade) {

        MultiVote mv = new MultiVote();
        return mv.getMultiVoteSettings(grade, "VoteTwoGrade");
    }

    public String getFirstVotePoints(String grade) {

        MultiVote mv = new MultiVote();
        return mv.getMultiVoteSettings(grade, "VoteOnePoints");
    }

    public String getSecondVotePoints(String grade) {

        MultiVote mv = new MultiVote();
        return mv.getMultiVoteSettings(grade, "VoteTwoPoints");
    }

    public boolean hasFirstVote(String grade) {

        if (this.getFirstVote(grade).equalsIgnoreCase("-")) {
            return false;
        } else {
            return true;
        }
    }

    public boolean hasSecondVote(String grade) {

        if (this.getSecondVote(grade).equalsIgnoreCase("-")) {
            return false;
        } else {
            return true;
        }

    }

    public boolean usedFirstVote() {
        try {
            PrintWriter printer = new PrintWriter(new FileWriter(this.getLocalStorageLocation() + "\\UsedFirstVote.db", true));
            printer.print("");
            String answer = "";
            printer.close();
            Scanner scFile = new Scanner(new File(this.getLocalStorageLocation() + "\\UsedFirstVote.db"));
            if (scFile.hasNext()) {
                answer = scFile.next();

            }
            if (answer.equalsIgnoreCase("Yes")) {

                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }

    public void useFirstVote() {
        PrintWriter printer = null;
        try {
            printer = new PrintWriter(new FileWriter(this.getLocalStorageLocation() + "\\UsedFirstVote.db", false));
            printer.print("Yes");
            printer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void clearFirstVote() {
        PrintWriter printer = null;
        try {
            printer = new PrintWriter(new FileWriter(this.getLocalStorageLocation() + "\\UsedFirstVote.db", false));
            printer.print("");
            printer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void refreshSettings() {
        try {
            System.out.println(this.getDatabaseLocation() + "\\Settings.db");
            Scanner scLine = new Scanner(new File(this.getDatabaseLocation() + "\\Settings.db")).useDelimiter("#");
            //used to get the Settings file's information and validate it.

            System.out.println(scLine.next());
            g8B = scLine.next();
            System.out.println(scLine.next());
            g8G = scLine.next();
            System.out.println(scLine.next());
            g9B = scLine.next();
            System.out.println(scLine.next());
            g9G = scLine.next();
            System.out.println(scLine.next());
            g10B = scLine.next();
            System.out.println(scLine.next());
            g10G = scLine.next();
            System.out.println(scLine.next());
            g11B = scLine.next();
            System.out.println(scLine.next());
            g11G = scLine.next();
             System.out.println(scLine.next());
            
            gTB = scLine.next();
             System.out.println(scLine.next());
            gTG = scLine.next();

            Scanner scLineV2 = new Scanner(new File(this.getDatabaseLocation() + "\\SettingsV2.db")).useDelimiter("#");
            //used to get the Settings file's information and validate it.

            System.out.println(scLineV2.next());
            g8Bv2 = scLineV2.next();
            System.out.println(scLineV2.next());
            g8Gv2 = scLineV2.next();
            System.out.println(scLineV2.next());
            g9Bv2 = scLineV2.next();
            System.out.println(scLineV2.next());
            g9Gv2 = scLineV2.next();
            System.out.println(scLineV2.next());
            g10Bv2 = scLineV2.next();
            System.out.println(scLineV2.next());
            g10Gv2 = scLineV2.next();
            System.out.println(scLineV2.next());
            g11Bv2 = scLineV2.next();
            System.out.println(scLineV2.next());
            g11Gv2 = scLineV2.next();
                System.out.println(scLineV2.next());
            gTBv2 = scLineV2.next();
             System.out.println(scLineV2.next());
            gTGv2 = scLineV2.next();

           
        } catch (Exception e) {//This will tell the user there is a problem with the settings file
            JOptionPane.showMessageDialog(null, "Unable to locate Settings File");
            e.printStackTrace();
        }
    }

    public void addToOptimisedVoteList(String grade, String fName, String sName) { // this method will add the user to the vote list preventing them from voting again

        try {
            
            PrintWriter optimiser = new PrintWriter(new FileWriter(this.getDatabaseLocation() + "\\AntiDoubleVote.db", true));
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd - HH:mm:ss");
            Calendar cal = Calendar.getInstance();

            Scanner oldUserName = new Scanner(new File(this.getLocalStorageLocation() + "\\OldUser.db"));
            String oldName = "";

            if (oldUserName.hasNext()) {

                oldName = oldUserName.nextLine();

            }
            String tag = (fName + "#" + sName + "#" + grade + "#" + oldName + "#" + dateFormat.format(cal.getTime()));
            tag = se.encrypt(tag);
            optimiser.println(tag);
            optimiser.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public boolean checkLicence() {
        
        try{
               Scanner scFile = new Scanner(new File(this.getDatabaseLocation() + "\\Licence.db"));
               
               String line = scFile.nextLine();
               line = se.decrypt(line);
               String[] parts = line.split("#");
           Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(parts[0]);
            Date date=Calendar.getInstance().getTime();
            if(date.before(date1))
            {

                return true;
            }
        } catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
                return false;
        
    }

}//end of class
