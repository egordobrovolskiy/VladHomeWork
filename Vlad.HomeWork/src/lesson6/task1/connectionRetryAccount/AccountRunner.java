package lesson6.task1.connectionRetryAccount;

import lesson6.task1.connectionRetryAccount.exceptions.AccountException;

public class AccountRunner {
    public static void main(String[] args) throws AccountException {
        Account account = new ConnectionRetryAccount(new RandomAccount(0.2, 0.3, 0.4), 5);

        account.withdraw(500);
    }
}
