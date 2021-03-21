package math;

import java.util.Scanner;

import org.junit.Test;

public class Day_5_msv {
    @Test
    public void TestPatternMSV() {
        String []msv = new String[5];
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập ma sv " + (i + 1));
            msv[i] = sc.nextLine();
            if (msv[i].matches("^[A-Za-z][0-9]+"))
            {
                System.out.println("Ma sinh vien " + msv[i] + " đúng định dạng ");
            } else {
                System.out.println("Ma sinh vien " + msv[i] + " sau format");
            }
        }
//        for (int i = 0; i < 5; i++) {
//            if (msv[i].matches("^[A-Za-z][0-9]+"))
//            {
//                System.out.println("Ma sinh vien " + msv[i] + " đúng định dạng ");
//            } else {
//                System.out.println("Ma sinh vien " + msv[i] + " sau format");
//            }
//        }

    }
}
