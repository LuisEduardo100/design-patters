package library_system.service;

public interface PenaltyStrategy {
  double calculatePenalty(long delayDays);
}
