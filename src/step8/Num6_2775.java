package step8;

import java.util.Scanner;

public class Num6_2775 {                    //문제에서는 범위가 나와있었지만 일반적인 범위로 만들어보았다.
    public int solution(int k, int n) {     //층수 : k , 호수 : n
        int[][] sum = new int[k+1][n];      //층수는 0층부터 시작하므로 k+1로 만들어준다.
                                            //예를 들어 1층이면 k=1이되면 0층,1층이 되어야되는데 [k]로 하면 1층만 생성되기때문에
        for (int i = 0; i < n; i++) {       //0층 i호수에는 사람들이 i만큼 살기때문에 다 대입
            sum[0][i] = i+1;
        }
        for (int i = 1; i < k+1; i++) {     //1층부터 k층까지 반복
            int cnt = 0;                    //사람들을 count할 변수 cnt
            for (int j = 0; j < n; j++) {   //호수
                cnt += sum[i-1][j];         //k-1층의 1호부터 n호까지의 사람수들의 합을 cnt에 더해줌
                sum[i][j] = cnt;            //cnt를 k층 n호수의 사람에게 넣어줌
            }
        }
        return sum[k][n-1];                 //return값의 sum[][]값은 index값이므로 위에서 설정해준[k+1][n]보다 하나씩 작게 해야된다.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Num6_2775 test = new Num6_2775();
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(test.solution(k, n));
        }
    }
}
