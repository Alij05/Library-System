import java.util.ArrayList;
import java.util.HashMap;

public class Professor extends Person {

    private int numberOfBorrowBooks;
    private HashMap<String,Book> borrowedItems;

    public Professor(String id, String password, String firstName, String lastName, String nationalId, String birthDate, String address) {
        super(id, password, firstName, lastName, nationalId, birthDate, address);
        this.numberOfBorrowBooks = 0;
        this.borrowedItems = new HashMap<>();
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

}
