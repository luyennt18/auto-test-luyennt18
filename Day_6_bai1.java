package math;

import org.junit.Test;

public class Day_6_bai1 {

    private int Tongnumber(int n) {
        if (n == 0) {
            return n;
        } else return (n + Tongnumber(n - 1));
    }


    @Test
    public void EvenTotalTest() {
        System.out.println(" Tổng là " + Tongnumber(5));
        System.out.println(" Tổng là " + Tongnumber(10));
        System.out.println(" Tổng là " + Tongnumber(558));
        System.out.println(" Tổng là " + Tongnumber(5898));


    }
}
