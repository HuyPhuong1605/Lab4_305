/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author PC
 */
public class LowPriorityRequest extends MaintenanceRequest {
    
    public String priority;
    public String status;
    public String expireDate;

    public LowPriorityRequest(String priority, String status, String expireDate) {
        this.priority = priority;
        this.status = status;
        this.expireDate = expireDate;
    }
    @Override
    public String setPriority() {
        return priority; 
    }

    @Override
    public String setStatus() {
        return status;   
    }

    @Override
    public String setExpire() {
        return expireDate;
    }

    @Override
    public String processRequest() {
        return "Emergency request, our Administer will contact you immediately!";
    }
      
}

