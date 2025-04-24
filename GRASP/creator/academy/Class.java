package creator.academy;

import java.util.ArrayList;
import java.util.List;

public class Class {
  private String code;
  private List<Student> students = new ArrayList<>();

  public Class(String code) {
    this.code = code;
  }

  public void addStudent(String name, String registration) {
    Student student = new Student(name, registration);
    students.add(student);
  }
}
