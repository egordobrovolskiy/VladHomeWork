package lesson6.task1.connectionRetryAccount.exceptions;

public class AccountException extends Exception {

    AccountException(String message) {
        super(message);
    }

    AccountException(String message, Throwable cause) {
        super(message, cause);
    }
}
