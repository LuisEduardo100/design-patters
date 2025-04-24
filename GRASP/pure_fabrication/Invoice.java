package pure_fabrication;

public class Invoice {
  private double amount;
  private double taxRate;

  public Invoice(double amount, double taxRate) {
    this.amount = amount;
    this.taxRate = taxRate;
  }

  public double calculateTax() {
    return amount * taxRate;
  }

  public double calculateTotal() {
    return amount + calculateTax();
  }

  public String toDataString() {
    return "Amount: $" + amount + ", Tax: $" + calculateTax() + ", Total: $" + calculateTotal();
  }
}
