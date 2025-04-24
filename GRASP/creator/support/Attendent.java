package creator.support;

public class Attendent {
  private String name;

  public Attendent(String name) {
    this.name = name;
  }

  // Padrão GRASP Creator: Atendente tem os dados necessários e cria o Chamado
  public Case openCase(String title, String description) {
    return new Case(title, description, this.name);
  }

  public String getName() {
    return name;
  }

}
