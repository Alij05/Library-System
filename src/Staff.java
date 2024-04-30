import java.util.ArrayList;
import java.util.HashMap;

public class Staff extends Person{
    private int numberOfBorrowBooks;
    private HashMap<String,Book> borrowedItems;
    private HashMap<Resource, ArrayList<String>> borrowingBook;


    public Staff(String id, String password, String firstName, String lastName, String nationalId, String birthDate, String address) {
        super(id, password, firstName, lastName, nationalId, birthDate, address);
        this.numberOfBorrowBooks = 0;
        this.borrowedItems = new HashMap<>();
        this.borrowingBook = new HashMap<>();
    }

    public int getNumberOfBorrowBooks() {
        return numberOfBorrowBooks;
    }

    public void setNumberOfBorrowBooks(int numberOfBorrowBooks) {
        this.numberOfBorrowBooks = numberOfBorrowBooks;
    }

    public HashMap<String, Book> getBorrowedItems() {
        return borrowedItems;
    }

    public void setBorrowedItems(String userId, Book book) {
        this.borrowedItems.put(userId,book);
    }

    public HashMap<Resource, ArrayList<String>> getBorrowingBook() {
        return borrowingBook;
    }

    public void setBorrowingBook(Resource resource, ArrayList<String> borrowingBook) {
        this.borrowingBook.put(resource,borrowingBook);
    }

}
