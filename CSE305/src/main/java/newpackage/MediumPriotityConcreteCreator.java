/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author PC
 */
public class MediumPriotityConcreteCreator implements RequestCreator {
    
    
    public String priority1;
    public String status1;
    public String expireDate1;
    
    MediumPriorityRequest priotity =  new MediumPriorityRequest(priority1,status1,expireDate1);

    public MaintenanceRequest createRequest() {
     return priotity;
    }

    @Override
    public String processRequest() {
        return priotity.processRequest();
    }

   
}