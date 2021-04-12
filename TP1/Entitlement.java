package TP1;

import java.util.Date;

public class Entitlement {
    private String EIP;
    private EntitlementType type;
    private Date startDate;
    private Date endDate;
    private Boolean neverExpires;
    private String comments;
    private Customer customer;

    Entitlement(){
        this.neverExpires = true;
    }

    Entitlement(String EIP, EntitlementType type, Date startDate, Date endDate, Boolean neverExpires, String comments) {
        this.EIP = EIP;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.neverExpires = neverExpires;
        this.comments = comments;
    }

    public String getEIP() {
        return this.EIP;
    }

    public void setEIP(String EIP) {
        this.EIP = EIP;
    }

    public EntitlementType getType() {
        return this.type;
    }

    public void setType(EntitlementType type) {
        this.type = type;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean isNeverExpires() {
        return this.neverExpires;
    }

    public Boolean getNeverExpires() {
        return this.neverExpires;
    }

    public void setNeverExpires(Boolean neverExpires) {
        this.neverExpires = neverExpires;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Customer getCustomer(){
        return this.customer;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }
}
