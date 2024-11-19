/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cse305;

/**
 *
 * @author PC
 */
public abstract class Document {
    
    public String extension;
    public String encryption;
    
     public Document(String extension, String encryption) {
        this.extension = extension;
        this.encryption = encryption;
    }
    
    public abstract String SetExtension();
    public abstract String SetEncryption();
    public abstract Document BuilDocument();

    
}
