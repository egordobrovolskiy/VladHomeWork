package lesson6.task1.connectionRetryAccount;

import lesson6.task1.connectionRetryAccount.exceptions.AccountConnectionException;
import lesson6.task1.connectionRetryAccount.exceptions.AccountException;
import lesson6.task1.connectionRetryAccount.exceptions.AccountExpiredException;
import lesson6.task1.connectionRetryAccount.exceptions.NotEnoughFundsException;

public class ConnectionRetryAccount implements Account {
    private Account account;
    private int retries;

    ConnectionRetryAccount(Account account, int retries) {
        this.account = account;
        this.retries = retries;
    }

    @Override
    public void withdraw(long money) throws AccountException {

        try {
            account.withdraw(money);
        } catch (NotEnoughFundsException | AccountExpiredException e) {
            e.printStackTrace();
        } catch (AccountConnectionException e) {
            e.printStackTrace();
            retries--;
            if (retries != 0) {
                System.err.println("========  Осталось попыток соединения: " + retries + "   ==============");
                withdraw(money);
            }
//            e.printStackTrace();
        }
    }
}
