package low_coupling.notification_service;

public class SmsNotifier implements Notifier {

  @Override
  public void send(String message) {
    System.out.println("Sending SMS: " + message);
  }

}
