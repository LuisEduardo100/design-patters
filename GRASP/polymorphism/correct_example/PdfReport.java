package polymorphism.correct_example;

public class PdfReport implements ReportGenerator {

  @Override
  public void generateReport() {
    System.out.println("Generating PDF report...");
  }
}
