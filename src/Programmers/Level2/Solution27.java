package Programmers.Level2;

public class Solution27 {
    public long solution(int w, int h) {            //멀쩡한 사각형
        long answer = 1;
        long wg = w/gcd(w,h);                       //가로,세로길이에서 최대 공약수로 나눈 값
        long hg = w/gcd(w,h);
        answer = w*h-((wg*hg)-(wg+hg-1))*gcd(w,h);  //자세한 풀이는 블로그에
        return answer;
    }

    public long gcd(long w, long h){                //최대 공약수 찾는 메서드
        long n = w%h;                               //유클리드 호제법을 이용하여 최대 공약수를 구함
        if(n==0){
            return h;
        }else{
            return gcd(h,n);
        }
    }
}
