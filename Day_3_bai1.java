package math;

import java.util.Scanner;

public class Day_3_bai1 {

    public static void main(String[] args) {
        int n = 20;
        long b = 1;
        for (int i = 1; i <= n; i++) {
            b = b * i;
        }
        System.out.println(n + "! = " + b);


    }

}




