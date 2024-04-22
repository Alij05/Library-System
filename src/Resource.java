public class Resource {
    private String sourceId;
    private String title;
    private String author;
    private String categoryId;
    private String libraryId;

    public Resource(String sourceId, String title, String author, String categoryId, String libraryId) {
        this.sourceId = sourceId;
        this.title = title;
        this.author = author;
        this.categoryId = categoryId;
        this.libraryId = libraryId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getLibraryId() {
        return libraryId;
    }
}
