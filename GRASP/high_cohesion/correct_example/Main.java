package high_cohesion.correct_example;

public class Main {
  public static void main(String[] args) {
    InvoiceService invoiceService = new InvoiceService();
    DatabaseConnector dbConnector = new DatabaseConnector();
    EmailService emailService = new EmailService();

    double amount = 500.0;

    invoiceService.printTax(amount);
    dbConnector.connect();
    emailService.sendEmail("Thank you for your purchase!");
  }
}
