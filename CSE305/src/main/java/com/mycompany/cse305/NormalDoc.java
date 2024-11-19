package com.mycompany.cse305;

/**
 *
 * @author PC
 */
public class NormalDoc extends Document {

    @Override
    public String SetExtension() {
        return ".txt";
    }

    @Override
    public String SetEncryption(String exString) {
        return exString;
    }

    @Override
    public Document BuilDocument() {
        return this;
    }
}
