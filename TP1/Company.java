package TP1;

public class Company extends Customer {
    private String name;
    private String phone;
    private String fax;
    private Contact contact;
    private Details billing;
    private Details shipping;

    Company(int id){
        super(id, CustomerType.Company, "");
        this.contact = new Contact();
        this.billing = new Details();
        this.shipping = new Details();
    }

    Company(int id, String name, String phone, String fax){
        super(id, CustomerType.Company, "");
        this.name = name;
        this.phone = phone; 
        this.fax = fax;
        this.contact = new Contact();
        this.billing = new Details();
        this.shipping = new Details();
    }

    public Contact getContact(){
        return this.contact;
    }

    public void setContact(Contact contact){
        this.contact = contact;
    }

    public Details getBilling(){
        return this.billing;
    }

    public void setBilling(Details billing){
        this.billing = billing;
    }

    public Details getShipping(){
        return this.shipping;
    }

    public void setShipping(Details shipping){
        this.shipping = shipping;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}
