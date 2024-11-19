/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author PC
 */
public class HighPriotityConcreteCreator implements RequestCreator{
    
    public String priority1;
    public String status1;
    public String expireDate1;

    public HighPriotityConcreteCreator(String priority1, String status1, String expireDate1) {
        this.priority1 = priority1;
        this.status1 = status1;
        this.expireDate1 = expireDate1;
    }
    
    
    
    HighPriorityRequest priotity =  new HighPriorityRequest(priority1,status1,expireDate1);

    @Override
    public MaintenanceRequest createRequest() {
     return priotity;
    }

    @Override
    public String processRequest() {
        return priotity.processRequest();
    }
}
