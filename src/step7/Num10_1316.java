package step7;

import java.util.Scanner;

public class Num10_1316 {
    static Scanner sc = new Scanner(System.in);

    public static boolean check() {
        boolean[] alphabet = new boolean[26];
        int prev = 0;
        String str = sc.next();

        for(int i = 0; i < str.length(); i++) {
            int n = str.charAt(i);
            if (prev != n) {
                if ( alphabet[n - 'a'] == false ) {
                    alphabet[n - 'a'] = true;
                    prev = n;
                }
                else {
                    return false;
                }
            }
            else {
                continue;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int count = 0;
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            if (check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }
}
