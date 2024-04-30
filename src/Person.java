import java.util.ArrayList;
import java.util.HashMap;

public class Person {
    private String id;
    private String password;
    private String firstName;
    private String lastName;
    private String nationalId;
    private String birthDate;
    private String address;

    private HashMap<String,Boolean> inBorrow;
    private HashMap<String,String> borrowFromLibrary;
    private HashMap<String, HashMap<String , Library>> check;

    private HashMap<String, ArrayList<String>> borrowedBook;
    private HashMap<Resource, ArrayList<String>> borrowingBook;
    private HashMap<String,Boolean> isDebtor;

    public Person(String id, String password, String firstName, String lastName, String nationalId, String birthDate, String address) {
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalId = nationalId;
        this.birthDate = birthDate;
        this.address = address;

        this.inBorrow = new HashMap<>();
        this.borrowFromLibrary = new HashMap<>();
        this.borrowedBook = new HashMap<>();
        this.borrowingBook = new HashMap<>();
        this.isDebtor = new HashMap<>();

        this.check = new HashMap<>();
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

    public HashMap<String, Boolean> getInBorrow() {
        return inBorrow;
    }

    public void setInBorrow(String id, Boolean isBorrow) {
        this.inBorrow.put(id,isBorrow);
    }

    public HashMap<String, String> getBorrowFromLibrary() {
        return borrowFromLibrary;
    }

    public void setBorrowFromLibrary(String itemId, String libraryId) {
        this.borrowFromLibrary.put(itemId,libraryId);
    }

    public HashMap<String, HashMap<String, Library>> getCheck() {
        return check;
    }

    public void setCheck(String userId,HashMap<String, Library> check) {
        this.check.put(userId,check);
    }

    /**
     *
     */

    public HashMap<String, ArrayList<String>> getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(String itemId, ArrayList<String> time) {
        this.borrowedBook.put(itemId,time);
    }


//    public HashMap<String, ArrayList<String>> getBorrowingBook() {
//        return borrowingBook;
//    }


    public HashMap<Resource, ArrayList<String>> getBorrowingBook() {
        return borrowingBook;
    }

    public void setBorrowingBook(Resource resource, ArrayList<String> borrowingBook) {
        this.borrowingBook.put(resource,borrowingBook);
    }

    public HashMap<String, Boolean> getIsDebtor() {
        return isDebtor;
    }

    public void setIsDebtor(String id, Boolean isDebtor) {
        this.isDebtor.put(id,isDebtor);
    }
}
