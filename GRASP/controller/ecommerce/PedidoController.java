package controller.ecommerce;

public class PedidoController {
  private Order order;

  public void addItem(String name, double price, int quantity) {
    order.addItem(name, price, quantity);
  }

  public double completeTheOrder() {
    return order.calcularTotal();
  }
}
