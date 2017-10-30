package ru.av.p10;

public class D3 {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(100_000);
        System.out.println("Begin balance = " + account.getBalance());

        Thread withDrawThread = new WithDrawThread(account);
        Thread depositThread = new DepositThread(account);
        withDrawThread.start();
        depositThread.start();

        withDrawThread.join();
        depositThread.join();

        System.out.println("End balance = " + account.getBalance());
    }

    private static class WithDrawThread extends Thread {
        private final Account account;
        public WithDrawThread(Account account) {
            this.account=account;
        }

        @Override
        public void run() {
            for (int i = 0; i < 20_000; i++) {
                account.withdraw(1);
            }
        }
    }

    private static class DepositThread extends Thread {
        private final Account account;
        public DepositThread(Account account) {
            this.account=account;
        }

        @Override
        public void run() {
            for (int i = 0; i < 20_000; i++) {
                account.deposit(1);
            }
        }
    }
}