package TP1;

public class Individual extends Customer {
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;
    private String locale;

    public Individual(int id, String firstname, String lastname, String middlename, String email, String phone){
        super(id, CustomerType.Individual, "");
        this.firstName = firstname;
        this.lastName = lastname;
        this.middleName = middlename;
        this.email = email;
        this.phone = phone;
        this.locale = "English";
    }

    public Individual(int id){
        super(id, CustomerType.Individual, "");
        this.locale = "English";
    }
}
