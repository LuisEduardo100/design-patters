package information_expert;

public class Produto {
  private String name;
  private double price;
  private int qtdEstoque;

  public double calcularValotrTotalEmEstoque() {
    return price * qtdEstoque;
  }

}
