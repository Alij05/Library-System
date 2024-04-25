import java.util.HashMap;

public class Manager extends Person {

    private String libraryId;

    public Manager(String id, String password, String firstName, String lastName, String nationalId, String birthDate, String address,String libraryId) {
        super(id, password, firstName, lastName, nationalId, birthDate, address);
        this.libraryId = libraryId;
    }


    public String getLibraryId() {
        return libraryId;
    }

}
