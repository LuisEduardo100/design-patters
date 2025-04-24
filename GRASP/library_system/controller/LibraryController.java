package library_system.controller;

import library_system.models.Book;
import library_system.models.Loan;
import library_system.models.User;
import library_system.service.LoanService;
import library_system.utils.Logger;

public class LibraryController {
  private LoanService loanService;
  private Logger logger;

  public LibraryController(LoanService loanService, Logger logger) {
    this.loanService = loanService;
    this.logger = logger;
  }

  public Loan borrowBook(Book book, User user) {
    Loan loan = loanService.createLoan(book, user);
    if (loan != null) {
      logger.log(user.getName() + " borrowed '" + book.getTitle() + "'");
    } else {
      logger.log("Book '" + book.getTitle() + "' is not available");
    }
    return loan;
  }

  public void returnBook(Loan loan) {
    double penalty = loanService.returnLoan(loan);
    logger.log(loan.getUser().getName() + " returned '" + loan.getBook().getTitle()
        + "' with penalty: $" + penalty);
  }
}
