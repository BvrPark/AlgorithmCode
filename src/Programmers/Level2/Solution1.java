package Programmers.Level2;

public class Solution1 {
    public int solution(int[] arr) {            //N개의 최소공배수
        int answer = LCM(arr[0],arr[1]);        //우선 답에 주어진 숫자배열의 첫번째, 두번째의 최소공배수를 넣는다.
        if(arr.length>1){                       //주어진 숫자의 갯수가 1개보다 많을 때,
            for(int i = 2;i<arr.length;i++){    //나머지 숫자들의 최소공배수를 구한다.
                answer = LCM(answer,arr[i]);
            }
        }else{                                  //주어진 숫자의 갯수가 1개일때,
            answer = arr[0];                    //제일 처음 주어진 수가 최소공배수이다.
        }
        return answer;
    }

    public int LCM(int a, int b){               //최소 공배수를 구하는 메서드
        return (a*b)/GCD(a,b);
    }
    public int GCD(int a, int b){               //최대공약수를 구하는 메서드(유클리드 호제법을 이용)
        if((a%b) == 0){
            return b;
        }else{
            return GCD(b,a%b);
        }
    }
}
