package polymorphism.wrong_example;

public class ReportService {
  public void printReport(String type) {
    if (type.equals("PDF")) {
      System.out.println("Generating PDF report...");
    } else if (type.equals("EXCEL")) {
      System.out.println("Generating Excel report...");
    }
  }
}
