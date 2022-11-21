package solved.class_1;

import java.util.Scanner;

//검증 수
public class Normal_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i<5; i++){
            sum += Math.pow(sc.nextInt(),2);    //값을 입력 받을 때마다 제곱을 해서 sum에 더한다.
        }
        System.out.println(sum%10);             //sum을 10으로 나누고 나머지 값을 출력
    }
}
