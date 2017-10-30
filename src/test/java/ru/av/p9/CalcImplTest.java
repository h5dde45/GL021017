package ru.av.p9;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcImplTest {

    private CalcImpl calc;//for methods
//    private static CalcImpl calc;//for class

    @Before
    public  void setUp() throws Exception {
        calc = new CalcImpl();
    }

    @Test
    public void testZero() throws Exception {
        double result = calc.calculate("0");
        assertEquals(0,result,1e-9);
    }

    @Test
    public void floatingPoint() throws Exception {
        double result =calc.calculate("-3.3e3");
        assertEquals(-3300,result,1e-9);
    }

    @Test
    public void add() throws Exception {
        double result =calc.calculate("2+2");
        assertEquals(4,result,1e-9);

    }
}