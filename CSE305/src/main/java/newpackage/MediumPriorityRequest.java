/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author PC
 */
class MediumPriorityRequest extends MaintenanceRequest {
    
    
    
    public String priority1;
    public String status1;
    public String expireDate1;

    public MediumPriorityRequest(String priority, String status, String expireDate) {
        this.priority1 = priority;
        this.status1 = status;
        this.expireDate1 = expireDate;
    }
    @Override
    public String setPriority() {
        return priority1; 
    }

    @Override
    public String setStatus() {
        return status1;   
    }

    @Override
    public String setExpire() {
        return expireDate1;
    }

    @Override
    public String processRequest() {
        return "Emergency request, our Administer will contact you immediately!";
    }
    
    
}
