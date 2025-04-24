package library_system.utils;

import java.time.LocalDateTime;

public class Logger {
  public void log(String message) {
    System.out.println("[" + LocalDateTime.now() + "] " + message);
  }
}