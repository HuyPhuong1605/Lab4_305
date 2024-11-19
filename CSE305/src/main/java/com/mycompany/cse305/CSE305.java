/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cse305;



import java.util.Scanner;

/**
 *
 * @author PC
 */
public class CSE305 {

   static Scanner readScanner = new Scanner(System.in);
    public static void main(String[] args) {
   
    System.out.println("Type your contractID)");
   int contractID = readScanner.nextInt();
    System.out.println("Type your propertyID)");
   int propertyID = readScanner.nextInt();
    System.out.println("Type your tenanatID)");
   int tenanatID =  readScanner.nextInt();
    System.out.println("Type your rentAmonut)");
   String rentAmonut = readScanner.next();
    System.out.println("Type your contract");
   String contract = readScanner.next();

   String input = "";
        switch (contract) {
            case "Permanent" -> {
                Permanent permanent = new Permanent(contractID, propertyID, tenanatID, rentAmonut);
                input = permanent.toString();
}
            case "LongTerm" -> {
                LongTerm longTerm = new LongTerm(contractID, propertyID, tenanatID, rentAmonut);
                input = longTerm.toString();
}
            case "ShortTerm" -> {
                 ShortTerm shortTerm = new ShortTerm(contractID, propertyID, tenanatID, rentAmonut);
                 input = shortTerm.toString();
            }
            default -> throw new AssertionError();
        }  
        
    
        
        
        
    }
}
