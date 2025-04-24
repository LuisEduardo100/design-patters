package pure_fabrication;

public class Main {
  public static void main(String[] args) {
    Invoice invoice = new Invoice(500.0, 0.1); // 10% de imposto

    Logger logger = new Logger("logs.txt");

    logger.log("New invoice created: " + invoice.toDataString());
  }
}