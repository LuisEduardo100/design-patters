package indirection;

public class UserController {
  private UserService service;

  public UserController(UserService service) {
    this.service = service;
  }

  public void createUser(String name) {
    service.saveUser(name);
  }
}
