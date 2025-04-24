package controller.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Order {
  private List<Item> items = new ArrayList<>();

  // Seguindo o padrão GRASP Creator: Order é responsável por criar seus próprios
  // Itens
  public void addItem(String name, double price, int quantity) {
    Item item = new Item(name, price, quantity);
    items.add(item);
  }

  public double calcularTotal() {
    double total = 0;
    for (Item i : items) {
      total += i.totalItemPrice();
    }
    return total;
  }
}