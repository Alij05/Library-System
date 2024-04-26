public class Thesis extends Resource {

    private String professorName;
    private String defenseYear;
    private int numberOfThesis;

    public Thesis(String sourceId, String title, String author, String categoryId, String libraryId,
                  String professorName, String defenseYear) {

        super(sourceId, title, author, categoryId, libraryId);
        this.professorName = professorName;
        this.defenseYear = defenseYear;
        this.numberOfThesis = 1;
    }

    public String getProfessorName() {
        return professorName;
    }
    public String getDefenseYear() {
        return defenseYear;
    }

    public int getNumberOfThesis() {
        return numberOfThesis;
    }

    public void setNumberOfThesis(int numberOfThesis) {
        this.numberOfThesis = numberOfThesis;
    }
}
