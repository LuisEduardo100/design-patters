package library_system.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Loan {
  private Book book;
  private User user;
  private LocalDate loanDate;
  private LocalDate dueDate;
  private LocalDate returnDate;

  public Loan(Book book, User user) {
    this.book = book;
    this.user = user;
    this.loanDate = LocalDate.now();
    this.dueDate = loanDate.plusDays(7);
  }

  public void returnBook() {
    this.returnDate = LocalDate.now();
    book.returnBook();
  }

  public long getDelayDays() {
    if (returnDate == null || !returnDate.isAfter(dueDate))
      return 0;
    return ChronoUnit.DAYS.between(dueDate, returnDate);
  }

  public Book getBook() {
    return book;
  }

  public User getUser() {
    return user;
  }
}
