/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cse305;

import java.util.Scanner;

public class Cilent {

    static Scanner readScanner = new Scanner(System.in);

    public static void main(String[] args) {

        String encryption = readScanner.nextLine();
        String extension = readScanner.nextLine();
        
        

        switch (extension) {
            case ".txt" -> {
                Document nor = new NormalDoc();
                nor.SetEncryption(encryption);
                nor.SetExtension();
                Document dc = nor.BuilDocument();
                System.out.println(dc);
            }

            case ".zip" -> {
                Document confi = new ConfidentialDocuments();
                confi.SetEncryption(encryption);
                confi.SetExtension();
                Document dc = confi.BuilDocument();
                System.out.println(dc);
            }
            default -> throw new AssertionError();
        }
        

    }
}
