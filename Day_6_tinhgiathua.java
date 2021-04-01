package math;

import org.junit.Test;

public class Day_6_tinhgiathua {
    int n;

    static int tinhgiaithua(int n) {
        if (n == 1) {
            return n;
        } else return (n * tinhgiaithua(n - 1));
    }


    @Test
    public void Tinhgiaithua() {
        System.out.println("Giai thừa là " + tinhgiaithua(10));
        System.out.println("Giai thừa là " + tinhgiaithua(5));
        System.out.println("Giai thừa là " + tinhgiaithua(8));
        System.out.println("Giai thừa là " + tinhgiaithua(1));
    }

}
