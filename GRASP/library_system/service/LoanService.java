package library_system.service;

import java.util.ArrayList;
import java.util.List;

import library_system.models.Book;
import library_system.models.Loan;
import library_system.models.User;

public class LoanService {
  private List<Loan> activeLoans = new ArrayList<>();
  private PenaltyStrategy penaltyStrategy;

  public LoanService(PenaltyStrategy strategy) {
    this.penaltyStrategy = strategy;
  }

  public Loan createLoan(Book book, User user) {
    if (!book.isAvailable())
      return null;

    book.borrow();
    Loan loan = new Loan(book, user);
    activeLoans.add(loan);
    return loan;
  }

  public double returnLoan(Loan loan) {
    loan.returnBook();
    activeLoans.remove(loan);
    return penaltyStrategy.calculatePenalty(loan.getDelayDays());
  }
}
