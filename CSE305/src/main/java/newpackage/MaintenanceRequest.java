/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author PC
 */
public abstract class MaintenanceRequest {
    public String priority;
    public String status;
    public String expireDate;

    public abstract void setPriority();
    public abstract void setStatus();
    public abstract void setExpire();
    public abstract String processRequest();

    public void printRequestDetails() {
        System.out.println("Priority: " + priority);
        System.out.println("Status: " + status);
        System.out.println("Expire Date: " + expireDate);
    }
    
}
