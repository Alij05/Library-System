public class Ganjineh extends Resource {
   private String publishers;
    private String printYear;
    private String donator;


    public Ganjineh(String sourceId, String title, String author, String categoryId, String libraryId,
                    String publishers, String printYear, String donator) {
        super(sourceId, title, author, categoryId, libraryId);
        this.publishers = publishers;
        this.printYear = printYear;
        this.donator = donator;
    }

    public String getPublishers() {
        return publishers;
    }

    public String getPrintYear() {
        return printYear;
    }

    public String getDonator() {
        return donator;
    }
}
