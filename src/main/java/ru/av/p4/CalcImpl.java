package ru.av.p4;

import java.util.Objects;

public class CalcImpl implements Calc {

    /**
     *
     * @param expression
     * @return
     * @throws NullPointerException when <code>expression</code> is null
     */
    @Override
    public double calculate(String expression) throws NewException {
        Objects.requireNonNull(expression,"Expression is null");

        if(expression.contains("!")){
            throw new NewException("Found not support the operator");
        }

//        if(expression==null){
//            throw new NullPointerException("expression is null");
//        }
        foo(expression);
        return 0;
    }

    private void foo(String expression) {
        bar(expression);
    }

    private void bar(String expression) {
        expression.toString();
    }
}
