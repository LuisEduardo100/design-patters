package low_coupling.payment;

public class PaypalPayment implements PaymentMethod {

  @Override
  public void pay(double amount) {
    System.out.println("Paid with PayPal: $" + amount);
  }

}
