package math;

import org.junit.Test;

public class Day_5_tong_chan {
    @Test

    public static void main(String[] args) {

        int n = 5;
        long tongchan = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                tongchan = tongchan + i;
                System.out.println(tongchan);
            }
        }
    }
}