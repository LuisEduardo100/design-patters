package polymorphism.correct_example;

public class ReportService {
  public void printReport(ReportGenerator generator) {
    generator.generateReport();
  }
}
