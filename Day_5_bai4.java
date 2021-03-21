package math;

import java.util.Scanner;

public class Day_5_bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            System.out.println("Moi nhap chuoi");
            String a = sc.nextLine();
            if (a.matches("^[A-Z][a-zA-Z0-9.-]{0,18}[0-9]$"))
                System.out.println("Duyệt");
            else {
                System.out.println("Không duyệt ");
            }
        }

    }
}