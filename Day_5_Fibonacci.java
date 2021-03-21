package math;

import java.util.Scanner;

public class Day_5_Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        int[] F = new int[n];
        F[0] = F[1] = 1;

        for (int i = 2; i < n; i++) {
            F[i] = F[i - 1] + F[i - 2];
            System.out.println("F[" + i + "] = " + F[i]);


        }
    }
}