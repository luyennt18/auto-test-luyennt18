package math;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestFirst {
    @Test
    public void test() {
        int answer = 2+2;
        assertEquals("2+2=4", 4, answer );
    }

    @Test
    public void test1()
    {
        int answer = 4/2 ;
        assertEquals("4/2=2", 2, answer );

    }

    @Test
    public void test2()
    {
        int answer = 2*2;
        assertEquals("2*2=4", 4, answer );

    }

    @Test
    public void test3()
    {
        int answer = 4;
        assertEquals("4", 5, 4);
    }
}