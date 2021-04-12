package TP1;

public class Individual extends Customer {
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;
    private String locale;

    public Individual(String firstname, String lastname, String middlename, String email, String phone){
        this.firstName = firstname;
        this.lastName = lastname;
        this.middleName = middlename;
        this.email = email;
        this.phone = phone;
        this.locale = "English";
    }

    public Individual(){
        this.locale = "English";
    }
}
