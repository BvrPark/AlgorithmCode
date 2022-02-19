package Programmers.Level1;

public class Solution22 {               //두 정수 사이의 합
    public long solution(int a, int b) {
        long max = Math.max(a,b);       // 둘 중 큰 값을 max, 작은 값을 min에 넣는다.
        long min = Math.min(a,b);
        return (min+max)*(max-min+1)/2; // 등차수열의 합 공식을 사용해서 합 구함
    }
}
