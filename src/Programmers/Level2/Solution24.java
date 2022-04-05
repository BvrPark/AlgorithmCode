package Programmers.Level2;

public class Solution24 {
    public int solution(int n) {    //점프와 순간이동
        int ans = 0;
        while(n>0){                 //자세한 풀이는 블로그에 기재
            ans += n%2;
            n = n/2;
        }
        return ans;
    }
}
