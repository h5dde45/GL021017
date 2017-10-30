package ru.av.p9;

public class CalcImpl implements Calc{
    @Override
    public double calculate(String expression) {
        return Double.parseDouble(expression);
    }

}
