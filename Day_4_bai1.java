package math;

import com.sun.codemodel.JCatchBlock;
import com.sun.tools.xjc.model.CAdapter;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Day_4_bai1 {
    @Test
    public static void main(String[] args) {

//        Calendar ngay = Calendar.getInstance();
//        System.out.println(" In ngay: "+ngay.getTime());
        // chuyển kiểu dữ liệu từ String sang date
//        Date date = new Date();
//        System.out.println(date);
//        DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//
//        String datestring = df.format(date);
//        System.out.println(" In ngay: "+datestring);

        String startDateString = "2021-02-12";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate;
        Calendar cal = Calendar.getInstance();
        try {
            startDate = df.parse(startDateString);
            cal.setTime(startDate);
            System.out.println("Day of week: " + cal.get(Calendar.DAY_OF_WEEK));
            System.out.println("week of year: " + cal.get(Calendar.WEEK_OF_YEAR));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

