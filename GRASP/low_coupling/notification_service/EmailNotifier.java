package low_coupling.notification_service;

public class EmailNotifier implements Notifier {

  @Override
  public void send(String message) {
    System.out.println("Sending email: " + message);
  }

}
