package ru.core.mt.p2;

public class NewRunnable implements Runnable {
    private final String msg;

    public NewRunnable(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(msg + " " + (i + 1));
        }
    }
}
