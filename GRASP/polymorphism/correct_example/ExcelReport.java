package polymorphism.correct_example;

public class ExcelReport implements ReportGenerator {

  @Override
  public void generateReport() {
    System.out.println("Generating Excel report...");
  }

}
