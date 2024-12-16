package uz.shaxzod.loan.exception;

public class LoanAlreadyExistException extends RuntimeException {
    public LoanAlreadyExistException(String message) {
        super(message);
    }
}
