/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author PC
 */
public interface RequestCreator{
    
     public MaintenanceRequest createRequest();
     public String processRequest();
    
    
    
//    public static MaintenanceRequest createMaintenanceRequest(String priority) {
//        switch (priority) {
//            case "Low":
//                return new LowPriorityRequest();
//            case "Medium":
//                return new MediumPriorityRequest();
//            case "High":
//                return new HighPriorityRequest();
//            default:
//                throw new IllegalArgumentException("Invalid priority");
//        }
//    }
}

