package ru.n2.t8;

public class Lab3 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 10_000_000; i++) {
            String spaces=spaces(i);
            Runnable printer=new PrintRunnable(spaces+i,1000);
            Thread thread=new Thread(printer);
            thread.start();
            Thread.sleep(1000);
        }
    }

    private static String spaces(int i) {
        StringBuilder result=new StringBuilder("");
        for (int j = 0; j < i; j++) {
            result.append(' ');
        }

        return result.toString();
    }
}
