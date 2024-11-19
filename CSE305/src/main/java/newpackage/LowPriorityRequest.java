
package newpackage;

/**
 *
 * @author PC
 */
public class LowPriorityRequest extends MaintenanceRequest {
    
    public String priority1;
    public String status1;
    public String expireDate1;

    public LowPriorityRequest(String priority, String status, String expireDate) {
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

