package math;

import java.util.Scanner;

public class Day3_bai2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {

        System.out.println(" nhap a ");
        float a = Day3_bai2.sc.nextFloat();
        System.out.println(" nhap b ");
        float b = Day3_bai2.sc.nextFloat();
        System.out.println(" nhap c ");
        float c = Day3_bai2.sc.nextFloat();
        Day3_bai2.giaiphuongtrinh(a, b, c);
    }

    public static void giaiphuongtrinh(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                System.out.println("phuong trinh co 1 nghiem" + "x= " + (-c / b));
            }
        }

        float delta = b * b - 4 * a * c;
        float x1;
        float x2;
        if (delta > 0) {
            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("Phương trình có 2 nghiệm là: "
                        + "x1 = " + x1 + " và x2 = " + x2);
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("Phương trình có nghiệm kép: "
                        + "x1 = x2 = " + x1);
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        }
    }
}
