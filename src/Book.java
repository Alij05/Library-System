public class Book extends Resource{
    private String publishers;
    private String printYear;
    private String amountOfCopy;
    private int numberOfBooks;

    public Book(String sourceId, String title, String author, String categoryId, String libraryId,
                String publishers, String printYear, String amountOfCopy) {

        super(sourceId, title, author, categoryId, libraryId);
        this.publishers = publishers;
        this.printYear = printYear;
        this.amountOfCopy = amountOfCopy;
        this.numberOfBooks = 0;
    }

    public String getPublishers() {
        return publishers;
    }

    public String getPrintYear() {
        return printYear;
    }

    public String getAmountOfCopy() {
        return amountOfCopy;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }
}
