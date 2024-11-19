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
    
    public abstract void SetExtension();
    public abstract void SetEncryption(String input);
    public abstract Document BuilDocument();

    @Override
    public String toString() {
        return "Document{" + "extension=" + extension + ", encryption=" + encryption + '}';
    }

    
    
}
