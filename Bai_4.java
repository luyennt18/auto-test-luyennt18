package math;

import org.junit.Test;

public class Bai_4 {

    static boolean Year(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return year % 100 == 0 && year % 400 == 0;

//        return (year % 4 == 0 && year % 100 != 0) ||
//                (year % 100 == 0 && year % 400 == 0);
    }

    @Test
    public void Bai_4() {
        int year = 2100;

        System.out.println(Year(year) ? "Là năm nhuận" : "Không là năm nhuận");
    }
}