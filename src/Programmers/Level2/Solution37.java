package Programmers.Level2;

public class Solution37 {
    public long solution(int n) {           //멀리 뛰기
        long answer = 0;
        long f = 1;
        long s = 2;
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            for (int i = 3; i <= n; i++) {
                answer = (f + s) % 1234567;
                f = s;
                s = answer;
            }
            return answer;
        }

    }
}
