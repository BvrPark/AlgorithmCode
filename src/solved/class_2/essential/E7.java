package solved.class_2.essential;

import java.util.Scanner;

//소수 찾기(1978번)
public class E7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();               //입력할 숫자의 갯수
        int[] arr = new int[1001];          //주어진 범위보다 1많게 배열 생성
        int count = 0;                      //소수 갯수 count

        arr[1] = 1;                         //에라토스테네스의 체를 사용해서 풀었다. 자세한 풀이는 블로그와 깃허브에 기재
        for (int i = 2; i < 1001; i++) {
            if(arr[i] == 0){
                for (int j = i*2; j < 1001; j += i) {
                    arr[j] = 1;
                }
            }
        }

        for (int k = 0; k < n; k++) {
            if(arr[sc.nextInt()]==0){
                count++;
            }
        }

        System.out.println(count);

    }
}
