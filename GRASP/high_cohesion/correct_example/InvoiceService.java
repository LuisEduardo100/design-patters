package high_cohesion.correct_example;

public class InvoiceService {
  private final double TAX_RATE = 0.2;

  public double calculateTax(double amount) {
    return amount * TAX_RATE;
  }

  public void printTax(double amount) {
    double tax = calculateTax(amount);
    System.out.println("Tax: $" + tax);
  }
}
