/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cse305;

import static com.mycompany.cse305.RentalManagement.RentalManagement_Application.decrypt;
import static com.mycompany.cse305.RentalManagement.RentalManagement_Application.encrypt;
import static com.mycompany.cse305.RentalManagement.RentalManagement_Application.generateKey;
import java.awt.TrayIcon;
import java.util.Scanner;
import javax.annotation.processing.Messager;
import javax.crypto.SecretKey;

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
            case "Permanent":{
                Permanent permanent = new Permanent(contractID, propertyID, tenanatID, rentAmonut);
                input = permanent.toString();
                break;}
            case "LongTerm":{
                LongTerm longTerm = new LongTerm(contractID, propertyID, tenanatID, rentAmonut);
                input = longTerm.toString();
                break;}
            case "ShortTerm":{
                 ShortTerm shortTerm = new ShortTerm(contractID, propertyID, tenanatID, rentAmonut);
                 input = shortTerm.toString();
                break;
            }
            default:
                throw new AssertionError();
        }  
        
        
        try {
            SecretKey key = generateKey();
        //    String message = "Hello my word!!!";
            String encryptedMessage = encrypt(input, key);
            System.out.println("Encrypted String: " + encryptedMessage);
            String decryptedMessage = decrypt(encryptedMessage, key);
            System.out.println("Decrypted String: " + decryptedMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }
}
