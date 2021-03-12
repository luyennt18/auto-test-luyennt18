package math;

import org.junit.Test;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Day_3_bai1 {
    @Test
    public static void main(String[] args) {
        int n = 200;

       BigDecimal b = BigDecimal.ONE;
        for (int i = 1; i <= n; i++) {
            b = b.multiply(BigDecimal.valueOf(i)) ;
        }
        System.out.println(n + "! = " + b);


    }

}




