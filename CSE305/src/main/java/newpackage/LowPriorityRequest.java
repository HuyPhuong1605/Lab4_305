
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
        return "Request denied";
    }
    
}

