package math;

import org.junit.Test;

import java.util.regex.Pattern;

public class Day_6_bai3 {
    public class Check {
        private void Check(String string) {
            Pattern a = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{0,8}$");
            if (a.matcher(string).matches()) {
                System.out.println(string + " Duyet");
            } else {
                System.out.println(string + " Khong duyet");
            }
        }

        @Test
        public void CheckTest() {
            Check("A9");
            Check("A 9");
            Check("dffdsA9");
            Check("@$@@#A1Ac3s_V09");
            Check("u4341Ac3s_/V09");
            Check("A1Ac3sV11đaqe3qe1111111sadfa2309");
        }
    }
}
