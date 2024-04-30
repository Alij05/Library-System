public class SellingBook extends Book {
    private String price;
    private String discount;
    private String amountOfCopy;


    public SellingBook(String sourceId, String title, String author, String categoryId, String libraryId, String publishers, String printYear, String amountOfCopy,
                       String price, String discount) {

        super(sourceId, title, author, categoryId, libraryId, publishers, printYear, amountOfCopy);
        this.price = price;
        this.discount = discount;
        this.amountOfCopy = amountOfCopy;
    }

    public String getPrice() {
        return price;
    }

    public String getDiscount() {
        return discount;
    }

}
