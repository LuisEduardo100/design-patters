package high_cohesion.wrong_example;

public class Utility {
  public void calculateInvoiceTax(double amount) {
    double tax = amount * 0.2;
    System.out.println("Tax: $" + tax);
  }

  public void connectToDatabase() {
    System.out.println("Connecting to database...");
  }

  public void sendEmail(String message) {
    System.out.println("Sending email: " + message);
  }
}