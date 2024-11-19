/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author PC
 */
public class HighPriorityRequest extends MaintenanceRequest {
    
    
    
    public String priority1;
    public String status1;
    public String expireDate1;

    public HighPriorityRequest(String priority, String status, String expireDate) {
        this.priority = priority;
        this.status = status;
        this.expireDate = expireDate;
    }
       @Override
    public void setPriority() {
        this.priority = priority1; 
    }

    @Override
    public void setStatus() {
        this.status = status1;   
    }

    @Override
    public void setExpire() {
        this.expireDate = expireDate1;
    }

    @Override
    public String processRequest() {
        return "Emergency request, our Administer will contact you immediately!";
    }
}

