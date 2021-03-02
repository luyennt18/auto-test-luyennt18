package math;

import org.junit.Test;

public class Bai_3 {
    enum Thang {thang1, thang2, thang3, thang4, thang5, thang6, thang7, thang8, thang9, thang10, thang11, thang12;}

    @Test
    public void Bai_3() {
        for (Thang m : Thang.values()) {
            System.out.println(m);
        }
    }
}
