package ru.av.p10;

public class Account {
    private long balance;

    public Account() {
        this(0);
    }

    public Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public /*synchronized*/ void deposit(long amount) {
        checkAmountNonNegative(amount);
        synchronized (this) {
            balance += amount;
        }
    }

    public /*synchronized*/ void withdraw(long amount) {
        checkAmountNonNegative(amount);
        if (balance < amount) {
            throw new IllegalArgumentException("not enough money");
        }
        synchronized (this) {
            balance -= amount;
        }
    }

    private void checkAmountNonNegative(long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("negative money");
        }
    }

}
