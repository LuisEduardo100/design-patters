package low_coupling.notification_service;

public class Main {
  public static void main(String[] args) {
    Notifier emailNotifier = new EmailNotifier();
    Notifier smsNotifier = new SmsNotifier();

    UserService userServiceEmail = new UserService(emailNotifier);
    UserService userServiceSMS = new UserService(smsNotifier);

    userServiceEmail.registerUser("alice_doe@email.com");
    userServiceSMS.registerUser("john_doe@email.com");
  }
}
