package pure_fabrication;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger {
  private String logFile;

  public Logger(String logFile) {
    this.logFile = logFile;
  }

  public void log(String message) {
    try (FileWriter writer = new FileWriter(logFile, true)) {
      writer.write(LocalDateTime.now() + " - " + message + "\n");
      System.out.println("Log saved.");
    } catch (IOException e) {
      System.err.println("Logging failed: " + e.getMessage());
    }
  }
}