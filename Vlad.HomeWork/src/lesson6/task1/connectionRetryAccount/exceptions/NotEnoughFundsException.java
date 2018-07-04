package lesson6.task1.connectionRetryAccount.exceptions;

public class NotEnoughFundsException extends AccountException {
    public NotEnoughFundsException(String message) {
        super(message);
    }
}
