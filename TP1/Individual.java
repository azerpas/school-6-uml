package TP1;

public class Individual extends Customer {
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;
    private String locale;
    private Details billing;
    private Details shipping;

    public Individual(int id, String firstname, String lastname, String middlename, String email, String phone){
        super(id, CustomerType.Individual, "");
        this.firstName = firstname;
        this.lastName = lastname;
        this.middleName = middlename;
        this.email = email;
        this.phone = phone;
        this.locale = "English";
        this.billing = new Details();
        this.shipping = new Details();
    }

    public Individual(int id){
        super(id, CustomerType.Individual, "");
        this.locale = "English";
        this.billing = new Details();
        this.shipping = new Details();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocale() {
        return this.locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Details getBilling() {
        return this.billing;
    }

    public void setBilling(Details billing) {
        this.billing = billing;
    }

    public Details getShipping() {
        return this.shipping;
    }

    public void setShipping(Details shipping) {
        this.shipping = shipping;
    }
}
