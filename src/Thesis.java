public class Thesis extends Resource {

    private String professorName;
    private String defenseYear;

    public Thesis(String sourceId, String title, String author, String categoryId, String libraryId,
                  String professorName, String defenseYear) {

        super(sourceId, title, author, categoryId, libraryId);
        this.professorName = professorName;
        this.defenseYear = defenseYear;
    }

    public String getProfessorName() {
        return professorName;
    }

    public String getDefenseYear() {
        return defenseYear;
    }
}
