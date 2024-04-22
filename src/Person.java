public class Person {
    private String id;
    private String password;
    private String firstName;
    private String lastName;
    private String nationalId;
    private String birthDate;
    private String address;

    public Person(String id, String password, String firstName, String lastName, String nationalId, String birthDate, String address) {
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalId = nationalId;
        this.birthDate = birthDate;
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }
}
