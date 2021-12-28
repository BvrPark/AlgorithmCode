package step8;

import java.util.Scanner;

public class Num2_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();               //입력하는 값
        int path = 1;                       //거쳐가는 방의 갯수(벌집 겹의 갯수)-> 초기에는 1겹이므로 1로 설정
        int range = 2;                      //각 방의 경계가 시작되는 최저숫자(1을 제외하고 2번째 줄의 최저는 2, 3번째줄은 8...)

        if (N == 1) {                       //만약 입력값이 1이면
            System.out.println(path);       //거쳐가는 방의 갯수는 1이므로 초기값을 그대로 출력
        } else {                            //입력값이 1이 아닐 경우
            while (N >= range) {            //입력값보다 각 방의 경계가 시작되는 최저숫자가 커질때 반복문을 나간다
                                            //ex) N=3일때 range가 8이면 입력값이 최저숫자보다 작아서 그 안에 존재하므로 path를 샐 수 있다.
                range = range + (6 * path); //range가 늘어나는 규칙은 처음은 6개 그다음은 12개 ...6*n개 만큼 늘어나므로 식을 이렇게 세운다.
                path++;                     //입력값보다 range가 작으면 탐색범위를 늘려야 되므로 겹의 갯수를 1개늘려서 재탐색
            }
            System.out.println(path);
        }
    }
}
