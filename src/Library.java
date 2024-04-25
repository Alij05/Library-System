import java.util.HashMap;

public class Library {
    private final String libraryId;
    private final String libraryName;
    private final String establishedYear;
    private final int table;
    private final String address;
    private HashMap<String,Library> booksLibrary;
    private HashMap<String,Library> thesesLibrary;
    private HashMap<String,Library> ganjinehLibrary;
    private HashMap<String,Library>sellingBookLibrary;
    private HashMap<String,Library> managerOfLibrary;


    public Library(String libraryId, String libraryName, String establishedYear, int table, String address) {
        this.libraryId = libraryId;
        this.libraryName = libraryName;
        this.establishedYear = establishedYear;
        this.table = table;
        this.address = address;
        this.booksLibrary = new HashMap<>();
        this.thesesLibrary = new HashMap<>();
        this.ganjinehLibrary = new HashMap<>();
        this.sellingBookLibrary = new HashMap<>();
        this.managerOfLibrary = new HashMap<>();
    }


//    public void add_book(){
//
//    }


    public void setBooksLibrary(String bookId, Library library) {
        this.booksLibrary.put(bookId,library);
    }

    public void setSellingBookLibrary(String sellingBook, Library library) {
        this.sellingBookLibrary.put(sellingBook,library);
    }

    public void setThesesLibrary(String thesisId, Library library) {
        this.thesesLibrary.put(thesisId,library);
    }

    public void setGanjinehLibrary(String ganjinehId, Library library) {
        this.ganjinehLibrary.put(ganjinehId,library);
    }
    public void removeBooksLibrary(String bookId, Library library) {
        this.booksLibrary.remove(bookId,library);
    }

    public void removeSellingBookLibrary(String sellingBook, Library library) {
        this.sellingBookLibrary.remove(sellingBook,library);
    }

    public void removeThesesLibrary(String thesisId, Library library) {
        this.thesesLibrary.remove(thesisId,library);
    }

    public void removeGanjinehLibrary(String ganjinehId, Library library) {
        this.ganjinehLibrary.remove(ganjinehId,library);
    }

    public void setManagerOfLibrary(String manager, Library library){
        managerOfLibrary.put(manager,library);
    }


    public HashMap<String, Library> getSellingBookLibrary() {
        return sellingBookLibrary;
    }

    public HashMap<String, Library> getBooksLibrary() {
        return booksLibrary;
    }

    public HashMap<String, Library> getThesesLibrary() {
        return thesesLibrary;
    }

    public HashMap<String, Library> getGanjinehLibrary() {
        return ganjinehLibrary;
    }

    public HashMap<String, Library> getManagerOfLibrary() {
        return managerOfLibrary;
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