//Ensure not more than x numbers of computers are being used
package com.Backend;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AntiOverload {

    commonMethods cm = new commonMethods();
/*
    public boolean checkOverloaded() {
        boolean overloaded = false;
        int actC = this.getActiveComputers();
        int maxC = this.getMaxComputers();
        if (actC >= maxC) {
            overloaded = true;
        }

        return overloaded;
    }

    public void addActiveComputer() {
        if (this.getActiveComputers() >= this.getMaxComputers()) {
        
        } else {

            try {
                PrintWriter printer = new PrintWriter(new FileWriter(cm.getDatabaseLocation() + "\\antiOverloadConnections.db", false));
                Scanner scFile = new Scanner(new File(cm.getDatabaseLocation() + "\\antiOverloadConnections.db"));
                int num = 0;
               if(scFile.hasNext())
               {
                    num = scFile.nextInt();
               }                
                    System.out.println(num);

                
                num++;
                                System.out.println(num);

                printer.println(num);
                scFile.close();
                printer.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void removeActiveComputer() {

        try {
            PrintWriter printer = new PrintWriter(new FileWriter(cm.getDatabaseLocation() + "\\antiOverloadConnections.db", false));
            Scanner scFile = new Scanner(new File(cm.getDatabaseLocation() + "\\antiOverloadConnections.db"));
            int num = 0;
             if(scFile.hasNext())
               {
                    num = scFile.nextInt();
                    
               }              
                System.out.println(num);
            
            if (num <= 0) {

            } else {
                num--;
                System.out.println(num);

            }

            printer.println(num);
            scFile.close();
            printer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public int getActiveComputers() {

        try {

            Scanner scFile = new Scanner(new File(cm.getDatabaseLocation() + "\\antiOverloadConnections.db"));
            int num = 0;
              if(scFile.hasNext())
               {
                    num = scFile.nextInt();
               }  
                
            

            scFile.close();
            if(num <= 0)
            {
              return 0;   
            }
            else
            {
                            return num;

            }

        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;

        }

    }

    public int getMaxComputers() {

        try {

            Scanner scFile = new Scanner(new File(cm.getDatabaseLocation() + "\\antiOverloadMaxConnections.db"));
            int num = 0;
            
                  if(scFile.hasNext())
               {
                    num = scFile.nextInt();
               }  

            scFile.close();
            return num;

        } catch (Exception ex) {
            ex.printStackTrace();

            return 0;

        }

    }
*/
}
