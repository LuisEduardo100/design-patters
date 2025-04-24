package creator.support;

public class Case {
  private String title;
  private String description;
  private String chiefAttendent;

  public Case(String title, String description, String chiefAttendent) {
    this.title = title;
    this.description = description;
    this.chiefAttendent = chiefAttendent;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public String getChiefAttendent() {
    return chiefAttendent;
  }

}
