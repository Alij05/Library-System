public class Library {
    private final String libraryId;
    private final String libraryName;
    private final String establishedYear;
    private final int table;
    private final String address;

    public Library(String libraryId, String libraryName, String establishedYear, int table, String address) {
        this.libraryId = libraryId;
        this.libraryName = libraryName;
        this.establishedYear = establishedYear;
        this.table = table;
        this.address = address;
    }


    public void add_book(){

    }





    public String getLibraryId() {
        return libraryId;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public String getEstablishedYear() {
        return establishedYear;
    }

    public int getTable() {
        return table;
    }

    public String getAddress() {
        return address;
    }
}
