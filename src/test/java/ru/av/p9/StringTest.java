package ru.av.p9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StringTest {
    @Test
    public void substringShouldCountCharsFrom() throws Exception {
        assertEquals('s', "asd".charAt(1));
    }



    @Test//(expected = StringIndexOutOfBoundsException.class)
    public void substringShouldException() throws Exception {
        try {
            "".substring(1);
            fail("Expected exception not thrown");
        } catch (Exception e) {
//            e.printStackTrace();
        }

    }

    @Test(timeout = 1111)
//    @Ignore
    public void shouldFinishIn1Second() throws Exception {
        Thread.sleep(2000);

    }
}
