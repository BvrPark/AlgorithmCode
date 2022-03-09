package Programmers.Level2;

public class Solution7 {
    public int solution(int n) {
        int answer = 1;                     //답
        int sum = 0;                        //합
        int lt = 1;                         //왼쪽 끝
        int rt = 2;                         //오른쪽 끝
        int length = (n/2)+1;               //주어진 숫자의 반값
        if(n == 1){             //n이 1일때, 1반환
            return answer;
        }else{                  //n이 1보다 클때,
            sum = lt+rt;        //lt+rt값을 초기 sum으로 지정
            while(lt != length || rt > length){ //반복문의 탈출 조건
                if(sum >= n){       //sum이 n보다 클 때,
                    if(sum == n){   //sum이 n과 같은지 확인한 후,
                        answer++;   //답의 갯수 1개 증가
                    }
                    sum -= lt;      //그리고 sum에서 lt값을 빼고 1개 증가 시킴
                    lt++;
                }else{              //sum이 n보다 작을 때,
                    rt++;           //rt값을 1개 증가시킴
                    sum += rt;      //sum에 rt를 더함.
                }
            }
        }

        return answer;
    }
}
