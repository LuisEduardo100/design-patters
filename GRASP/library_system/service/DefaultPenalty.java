package library_system.service;

public class DefaultPenalty implements PenaltyStrategy {
  public double calculatePenalty(long delayDays) {
    return delayDays * 1.5;
  }
}
