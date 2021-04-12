package TP1;

public class Company extends Customer {
    private String name;
    private String phone;
    private String fax;
    private Contact contact;

    Company(int id){
        super(id, CustomerType.Company, "");
    }

    Company(int id, String name, String phone, String fax, Contact contact){
        super(id, CustomerType.Company, "");
        this.name = name;
        this.phone = phone; 
        this.fax = fax;
        this.contact = contact;
    }
}
