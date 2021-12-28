package step7;

import java.util.Scanner;

public class Num6_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();			//문자열 입력 받음
        String S = s.trim();				//문자열 앞뒤 공백 삭제
        if(S.length() == 0) {
            System.out.println(0);
        }else {

            String[] arr = S.split(" ");			//문자열 공백 기준으로 배열에 나눠서 저장

            System.out.println(arr.length);			//배열의 갯수를 출력

        }

    }
}
