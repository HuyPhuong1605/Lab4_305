/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {

    static Scanner readScanner = new Scanner(System.in);

    public static void main(String[] args) {

//    public static MaintenanceRequest createMaintenanceRequest(String priority) {
//        
//    }
        String priority = readScanner.next();
        String status = readScanner.next();
        String expireDate = readScanner.next();

        MaintenanceRequest mainRequest;
        switch (priority) {
            case "Low":

                lowPriotityConcreteCreator low =  new lowPriotityConcreteCreator(priority,status,expireDate);
                mainRequest = low.createRequest();
                
                System.out.println(mainRequest);

            case "Medium":
                
                MediumPriotityConcreteCreator medium =  new MediumPriotityConcreteCreator(priority,status,expireDate);
                mainRequest = medium.createRequest();
                System.out.println(mainRequest);
                
            case "High":
                
                HighPriotityConcreteCreator high =  new HighPriotityConcreteCreator(priority,status,expireDate);
                mainRequest = high.createRequest();
                System.out.println(mainRequest);
                
            default:
                throw new IllegalArgumentException("Invalid priority");
        }
    }

}
