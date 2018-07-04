package lesson6.task1.connectionRetryAccount;

import lesson6.task1.connectionRetryAccount.exceptions.AccountConnectionException;
import lesson6.task1.connectionRetryAccount.exceptions.AccountException;
import lesson6.task1.connectionRetryAccount.exceptions.AccountExpiredException;
import lesson6.task1.connectionRetryAccount.exceptions.NotEnoughFundsException;

public class RandomAccount implements Account {
    private final double notEnoughFundsProbability;
    private final double accountExpiredProbability;
    private final double lostConnectionProbability;

    RandomAccount(double notEnoughFundsProbability, double accountExpiredProbability, double lostConnectionProbability) {
        this.notEnoughFundsProbability = notEnoughFundsProbability;
        this.accountExpiredProbability = accountExpiredProbability;
        this.lostConnectionProbability = lostConnectionProbability;
    }

    @Override
    public void withdraw(long money) throws AccountException {
        double random = Math.random();
        if (0 <= random && random < notEnoughFundsProbability)
            throw new NotEnoughFundsException("Random: " + random);
        if (notEnoughFundsProbability <= random && random < accountExpiredProbability + notEnoughFundsProbability)
            throw new AccountExpiredException("Random: " + random);
        if (accountExpiredProbability + notEnoughFundsProbability <= random && random < lostConnectionProbability + accountExpiredProbability + notEnoughFundsProbability)
            throw new AccountConnectionException("Random: " + random);
        System.err.println("++++++++++++++++++     You have " + money + " money!!!!!!!!!   +++++++++++++++++");
    }
}
