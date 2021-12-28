package step7;

import java.util.Scanner;

public class Num3_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[26];
        for(int i = 0;i<arr.length;i++) {
            arr[i] = -1;
        }
        for(int i = 0; i<s.length();i++) {
            char a = s.charAt(i);


            if (arr[a-'a'] == -1) {
                arr[a-'a'] = i;
            }
        }
        for(int c : arr) {
            System.out.print(c + " ");
        }
    }
}
