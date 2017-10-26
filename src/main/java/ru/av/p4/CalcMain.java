package ru.av.p4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcMain {
    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            for (; ; ) {
                System.out.println(">>");
                String expr = reader.readLine();
                System.out.println(">>> " + new CalcImpl().calculate(expr));
            }
        } catch (NewException | NullPointerException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
