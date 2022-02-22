package Programmers.Level1;

public class Solution28 {
    public int method(int n, int m) {       //최대공약수 구하는 메서드
        if(n % m == 0)                      //n>m이라 가정하고 n/m의 나머지가 없으면
            return m;                       //m이 최대공약수이므로 m을 return
        else                                // n/m의 나머지가 존재할 시
            return method(m, n % m);    // 재귀용법 사용
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n,m);            //둘중 큰 값을 max,작은 값을 min에 넣는다.
        int min = Math.min(n,m);
        answer[0] = method(min, max);
        answer[1] =(min * max) / answer[0]; //두 수의 곱에 최대 공약수로 나누면 최소 공배수가 된다.

        return answer;
    }
}
