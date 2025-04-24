package library_system.models;

public class Book {
  private String title;
  private String author;
  private boolean available = true;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public boolean isAvailable() {
    return available;
  }

  public void borrow() {
    this.available = false;
  }

  public void returnBook() {
    this.available = true;
  }

  public String getTitle() {
    return title;
  }
}
