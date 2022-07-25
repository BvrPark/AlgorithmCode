package Programmers.Level2;

public class Solution42 {
    public int solution(int n) {                //3xn 타일링
        int num = 1000000007;                   //너무 커서 나눠줘야 되는 수
        if(n < 2) {
            return 0;
        }
        long plus = 0;
        long[] dp = new long[n+1];              
        dp[0] = 1;                              //첫번째 케이스와 두번째 케이스의 수를 미리 설정
        dp[2] = 3;
        for(int i=4; i<=n; i+=2) {              //규칙에 따라서 dp[i]에 들어갈 수 있는 경우의 수를 대입
            plus += (2 * dp[i-4]) % num;
            dp[i] = (3 * dp[i-2] + plus) % num;
        }
        return (int) dp[n];
    }
}
