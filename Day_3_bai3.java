package math;

import java.util.Arrays;
import java.util.Scanner;

public class Day_3_bai3 {


    public static void main(String[] args) {
        String text;
        String an = "an";

        Scanner b = new Scanner(System.in);
        System.out.println("Các ký tự có trong chuỗi là: ");
        text = b.nextLine();

        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(an)) {
                System.out.println(words[i]);
            }
        }
    }
}
