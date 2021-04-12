package TP1;

abstract class Customer {
    private int CRM_ID;
    private CustomerType type;
    private String description;

    Customer(int CRM_ID, CustomerType type, String description){
        this.CRM_ID = CRM_ID;
        this.type = type;
        this.description = description;
    }
}