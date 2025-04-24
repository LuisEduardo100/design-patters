package protected_variations;

public class StripeAdapter implements PaymentGateway {

  @Override
  public void processPayment(double amount) {
    System.out.println("Processing payment via Stripe...");
  }

}
