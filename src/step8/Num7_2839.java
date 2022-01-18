package step8;

import java.util.Scanner;

public class Num7_2839 {
    public int solution(int N) {                //자세한 풀이는 블로그에 있음
        if (N % 5 == 0) {
            return N / 5;
        }else if (N == 4 || N == 7) {
            return -1;
        }else if (N % 5 == 1 || N % 5 == 3) {
            return (N / 5) + 1;
        }else if (N % 5 == 2 || N % 5 == 4) {
            return (N / 5) + 2;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Num7_2839 test = new Num7_2839();
        int N = sc.nextInt();
        System.out.println(test.solution(N));
    }
}
