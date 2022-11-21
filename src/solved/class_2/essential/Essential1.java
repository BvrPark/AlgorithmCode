package solved.class_2;

import java.util.Scanner;

//팰린드롬 수
public class Essential1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;                         //숫자를 String으로 변환 시킬 곳
        String reverse;                     //숫자를 뒤집을 곳
        int input = 0;                      //숫자를 입력 받을 곳
        while(true){
            input = sc.nextInt();
            if(input == 0){                 //입력 받은 값이 0일때 반복문 탈출
                break;
            }
            num = Integer.toString(input);  //입력 받은 정수를 String으로 변환
            reverse = new StringBuilder(num).reverse().toString();  //String으로 변환한 숫자를 reverse로 뒤집음
            if(num.equals(reverse)){        //뒤집은 숫자와 원래 숫자가 같을 때,
                System.out.println("yes");
            }else{                          //다를 때,
                System.out.println("no");
            }
        }
    }
}
