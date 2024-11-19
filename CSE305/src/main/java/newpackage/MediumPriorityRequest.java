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

    public String processRequest() {
        return "Request accept, estimated completion date is" + this.expireDate;
    }
    
    
}
