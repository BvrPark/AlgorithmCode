package step8;

import java.util.Scanner;

public class Num5_10250 {
    public String solution(int h, int w, int n) {
        int count = 0;                      //반복문이 돌때마다 count
        int h1 = 0;                         //층수
        int w1 = 0;                         //호수
        //문제를 분석해보면 손님들이 올때 엘리베이터에 가까운 곳부터 머물고 높은 층수보다 낮은 층수를 선호하므로
        //우선 층수부터 다 증가하고 나면 그다음에 호수가 하나 증가하는 방식으로 손님들에게 차례대로 배정된다.
        Loop:
        for (int i = 1; i <= w; i++) {      //호수를 증가
            for (int j = 1; j <= h; j++) {  //층수를 증가
                count++;                    //반복문이 돌때마다 1개 증가
                if (count == n) {           //반복문이 돈 횟수와 n번째 손님의 n이 같으면
                    h1 = j;                 //그때의 층수를 h1에
                    w1 = i;                 //그때의 호수를 w1에 저장하고
                    break Loop;             //제일 큰 반복문 탈출
                }
            }
        }

        return h1 + String.format("%02d", w1);  //층수는 그냥 호수는 두자리가 안될시 앞에 0을 붙여서 출력
    }


    public static void main(String[] args) {
        Num5_10250 test = new Num5_10250();
        Scanner sc = new Scanner(System.in);
        int test_num = sc.nextInt();            //입력할 테스트 데이터 갯수
        for (int i = 0; i < test_num; i++) {
            int h = sc.nextInt();               //층수
            int w = sc.nextInt();               //호수
            int n = sc.nextInt();               //n번째 손님
            System.out.println(test.solution(h, w, n));
        }
    }

}
