package library_system;

import library_system.controller.LibraryController;
import library_system.models.Book;
import library_system.models.Loan;
import library_system.models.User;
import library_system.service.DefaultPenalty;
import library_system.service.LoanService;
import library_system.utils.Logger;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Book book = new Book("1984", "George Orwell");
    User user = new User("Lucas");

    Logger logger = new Logger();
    LoanService loanService = new LoanService(new DefaultPenalty());
    LibraryController controller = new LibraryController(loanService, logger);

    Loan loan = controller.borrowBook(book, user);
    controller.returnBook(loan);
  }

}
