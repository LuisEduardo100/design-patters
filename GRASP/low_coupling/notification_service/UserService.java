package low_coupling.notification_service;

public class UserService {
  private Notifier notifier;

  public UserService(Notifier notifier) {
    this.notifier = notifier;
  }

  public void registerUser(String username) {
    System.out.println("User registered: " + username);
    notifier.send("Welcome " + username + "!");
  }
}
