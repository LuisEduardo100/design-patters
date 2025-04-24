import java.util.ArrayList;
import java.util.List;

public class Order {
  private List<Item> items = new ArrayList<>();

  // Seguindo o padrão GRASP Creator: Order é responsável por criar seus próprios
  // Itens
  public void addItem(String name, double price) {
    Item item = new Item(name, price);
    items.add(item);
  }
}