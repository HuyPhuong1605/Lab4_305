/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cse305;

/**
 *
 * @author PC
 */
public class LongTerm implements Contract{
    
  public int contractID;
  public  int propertyID;
  public int tenanatID;
  public String rentAmonut;

    public LongTerm(int contractID, int propertyID, int tenanatID, String rentAmonut) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenanatID = tenanatID;
        this.rentAmonut = rentAmonut;
    }

    @Override
    public int BuildcontractID() {
       return contractID;
    }

    @Override
    public int BuildpropertyID() {
        return propertyID;
    }

    @Override
    public int BuildtenanatID() {
       return tenanatID;
    }

    @Override
    public String BuildrentAmonut() {
       return rentAmonut;
    }    
    @Override
    public Contract SignContract() {
        Contract out = new Permanent(this.contractID, this.propertyID, this.tenanatID, this.rentAmonut);
       return out;
    }

    @Override
    public String toString() {
        return "LongTerm{" + "contractID=" + contractID + ", propertyID=" + propertyID + ", tenanatID=" + tenanatID + ", rentAmonut=" + rentAmonut + '}';
    }

    
    
    
    
}
