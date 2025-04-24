package low_coupling.payment;

public class CreditCardPayment implements PaymentMethod {

  @Override
  public void pay(double amount) {
    System.out.println("Paid with credit card: $" + amount);
  }

}
