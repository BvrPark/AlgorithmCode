package step6;

import java.util.Scanner;

public class Num3_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(number(sc.nextInt()));

    }

    public static int number(int number) {
        int c_number = 0;

        if (number < 100) {
            return number;
        }
        else {
            c_number = 99;
            if (number == 1000) {
                number = 999;
            }
            for (int i = 100; i <=number; i++) {

                int h = i / 100;
                int t = (i / 10) % 10;
                int s = i % 10;

                if ((h - t) == (t - s)) {
                    c_number++;
                }
            }

        }
        return c_number;

    }
}
