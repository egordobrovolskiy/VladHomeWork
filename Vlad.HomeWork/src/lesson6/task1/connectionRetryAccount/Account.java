package lesson6.task1.connectionRetryAccount;

import lesson6.task1.connectionRetryAccount.exceptions.AccountException;

public interface Account {
    void withdraw(long money) throws AccountException;
}
