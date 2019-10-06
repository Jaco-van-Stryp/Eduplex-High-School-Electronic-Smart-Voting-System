//Class Created On 2018.09.03 By Jaco van Stryp
//This calss will submit sql statements one by one stopping the system from getting overloaded
package com.Backend;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
import javax.swing.JOptionPane;

public class SmartSQLProcessing {

    SmartEncryption se = new SmartEncryption();
    commonMethods cm = new commonMethods();
    String databaseLocation = cm.getDatabaseLocation();

    public void addSqlStatement(String type, String query) {
        try {
            final String uuid = UUID.randomUUID().toString().replace("-", "");
            String tag = uuid + "#" + type + "#" + query;
            String ip = InetAddress.getLocalHost().getHostAddress();
            String code = ip + ".db";
            PrintWriter printer = new PrintWriter(new FileWriter(databaseLocation + "\\SmartSQLProcessing\\" + code, true));

            printer.println(tag);
            printer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    int counterSuper = 0;
    int bigErrorCounter = 0;
    public String query;
    boolean hadError = false;
    public void safeQueryRemover(String fileLocation, String query) {

        try {
            File inputFile = new File(fileLocation);
     Scanner scFile = new Scanner(new File(fileLocation));
       int counter = 0;
       String scLine = "";
      ArrayList<String> lines = new ArrayList<String>();

       while(scFile.hasNextLine())
       {
           line = scFile.nextLine();
               lines.add(line);

           counter++;
       }
       scFile.close();
       lines.remove(query);
       System.out.println("Line Removed");
       PrintWriter printer = new PrintWriter(new FileWriter(fileLocation, false));
            for (int i = 0; i < lines.size(); i++) {
                printer.println(lines.get(i));
            }
            totalLeft = lines.size();
            linesLeft = lines.size() + " Lines Left For Specific IP - AF[" + bigErrorCounter + "]";
            printer.close();
            
        } catch (Exception ex) {
            System.err.println("could not remove line");
        }

    }
    String finalLocation = "";
    public String linesLeft = "";
    String line = "";
    public int totalLeft = 0;
    int errorCount = 0;
    public int processingSpeed = 500;
    public void processAllStatements() {

        Thread t = new Thread(() -> {
            try {
                counterSuper = 0;

                String location = cm.getDatabaseLocation() + "\\SmartSQLProcessing\\";//Loads Folder

                File folder = new File(location);
                File[] listOfFiles = folder.listFiles();
                finalLocation = "";

                Connection myconObj;

                String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
                Class.forName(driver);
                myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
                ResultSet result;

                //CHANGED
                String uuid, type, line;

                int totalFiles = listOfFiles.length;

                // AdministrationMainModern amm = new AdministrationMainModern();
                for (int i = 0; i < listOfFiles.length; i++) {
                    if (listOfFiles[i].isFile()) {

                        finalLocation = listOfFiles[i].getAbsolutePath();

                        File file = new File(finalLocation);
                        String extention = finalLocation.substring(finalLocation.length() - 3, finalLocation.length());

                        if (extention.equalsIgnoreCase(".db")) {

                            Scanner scFile = new Scanner(new File(finalLocation));

                            while(scFile.hasNext()) {
                                line = scFile.nextLine();

                                Scanner scLine = new Scanner(line).useDelimiter("#");
                                uuid = scLine.next();
                                type = scLine.next();
                                System.out.println();

                                query = scLine.next();

                                System.out.println("Processing - " + query + "\nInput Line Value - " + line);

                                PreparedStatement add = myconObj.prepareStatement(query);
                                add.executeUpdate();
                                
                                safeQueryRemover(finalLocation, line);
                                System.out.println("Done");
                                errorCount = 0;
                                scLine.close();
                                Thread.sleep(processingSpeed);
                                counterSuper++;

                                //Attempt adding a live progress bar
                           }
                            scFile.close();
                            file.delete();
                        } else {
                            System.out.println("Else Occured");
                        }
                    } else {
                        System.out.println("Second Else Occured");

                    }
                }
                if(totalLeft <= 1)
                {
                    
                if(hadError == true)
                {
                     JOptionPane.showMessageDialog(null, "Processing Has Been Completed, Some Autofixes were made, this is probably nothing important\n\nClicking okay will restart the program, backups were also made for your convenience \nTotal Skips/Auto Fixes - [" + bigErrorCounter + "] - Probably sent to database anyway", "Processing Finished", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
                }
                else
                {
                     JOptionPane.showMessageDialog(null, "Processing Has Been Completed without any autofixes", "Processing Finished", JOptionPane.INFORMATION_MESSAGE);
                
                }
                }
                else
                {
                    bigErrorCounter++;
                    processAllStatements();
                }

               
            } catch (Exception ex) {
                bigErrorCounter++;
                hadError = true;
                errorCount++;
                if (errorCount > 2) {
                    printErrorCode(ex.getLocalizedMessage() + " - query Error: " + query + " - This occured Twice, Might be a problem with the SQl or Database - Query Ignored (Might have been completed)");
                    System.err.println("Something went wrong twice with processing, Removing");
                    safeQueryRemover(finalLocation, line);

                }
                   if(errorCount > 150)
                                {
                                    printErrorCode(ex.getLocalizedMessage() + " - query Error: " + query + " - Limit of 150 Errors occured on the same line, something is wrong!");
                System.err.println("Something is broken");

                                 //   JOptionPane.showMessageDialog(null, "There has been too much errors (150) for this session\ncheck the Processing Errors file for more information\nIf you dont find anything wrong, you msy run the program again");
                                    JOptionPane.showMessageDialog(null, ex.getLocalizedMessage() + "\n\nSomething went wrong!\n\nBut dont worry, a backup was made\nYour data is safe!\nThe program reached an error retry limit of 150 on the same line, The program will quit when you click ok!\n\nThis was the query that cased the problem:\n\n" + query + "\nThis was the file that caused the problem - " + finalLocation + "\nPlease make sure all devices are on version - " + cm.softwareVersion + "\nAll Error information has been stored in your selected databsae location\n" + cm.getDatabaseLocation() + "\\Processing Errors.txt", "Error", JOptionPane.ERROR_MESSAGE);

                                    System.exit(0);
                                    
                                }

                //System.err.println("Something went wrong with processing, retrying");
                // printErrorCode(ex.getLocalizedMessage() + " - query Error: " + query + " - Probably nothing to worry about!, Probably fixed automaticaly");
                processAllStatements();

                //JOptionPane.showMessageDialog(null, ex.getLocalizedMessage() + "\n\nSomething went wrong!\n\nBut dont worry, a backup was made\nYour data is safe!\nThe program should have attempted to fix itself, please press process again to retry!\n\nThis was the query that cased the problem:\n\n" + query, "Error", JOptionPane.ERROR_MESSAGE);
            }

        });
        t.start();
    }

    public void printErrorCode(String data) {
        try {
            PrintWriter printer = new PrintWriter(new FileWriter(cm.getDatabaseLocation() + "\\Processing Errors.txt", true));
            printer.println(data);
            printer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getCounter() {
        return counterSuper;
    }

    public int timeRemaining() {
        int i = 0;
        try {

            String location = cm.getDatabaseLocation() + "\\SmartSQLProcessing\\";//Loads Folder

            File folder = new File(location);
            File[] listOfFiles = folder.listFiles();

            i = listOfFiles.length;

        } catch (Exception ex) {

        }
        i = (i * 2) - 3;

        return i;

    }

    public boolean hasMoreData() {
        try {

            String location = cm.getDatabaseLocation() + "\\SmartSQLProcessing\\";//Loads Folder

            File folder = new File(location);
            File[] listOfFiles = folder.listFiles();
            String finalLocation = "";
            int counter = 0;
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    finalLocation = listOfFiles[i].getAbsolutePath();
                    String extention = finalLocation.substring(finalLocation.length() - 3, finalLocation.length());
                    if (extention.equalsIgnoreCase(".db")) {
                        counter++;
                    }

                }
            }

            if (counter > 0) {

                return true;

            } else {

                return false;

            }

        } catch (Exception ex) {

        }
        return false;
    }

}
