public class Category {
    private String categoryId;
    private String name;
    private String superCategory;

    public Category(String categoryId, String categoryName, String superCategory) {
        this.categoryId = categoryId;
        this.name = categoryName;
        this.superCategory = superCategory;

    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public String getSuperCategory() {
        return superCategory;
    }
}
