package math;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Bai_5 {
    @Test
    public void Bai_5_for() {
        for (int i = 1; i <= 10; i++) {
            if (i != 5) {
                System.out.println(i);
            }
        }
    }

    @Test
    public void Bai_5_do_while() {
        int i = 0;
        do {
            i++;
            if (i != 5) {
                System.out.println(i);
            }
        } while (i <= 9);
    }

    @Test
    public void Bai_5_while() {
        int i = 1;

        while (i <= 10) {
            if (i != 5) {
                System.out.println(i);
            }
            i++;
        }
    }

    @Test
    public void Bai_5_foreach() {
        Integer[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listNum = Arrays.asList(number);
        listNum.forEach(i -> {
            if (i != 5) {
                System.out.println(i);
            }
        });
    }
}
