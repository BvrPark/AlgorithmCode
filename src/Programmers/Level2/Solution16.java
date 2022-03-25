package Programmers.Level2;

public class Solution16 {                           //타겟 넘버
    static int answer = 0;                          //답을 static변수로 설정
    static int point = 0;                           //타겟을 담을 변수를 static변수로 설정
    public int solution(int[] numbers, int target) {
        point = target;                             //static변수에 target의 값을 대입
        DFS(0,0,numbers);
        return answer;
    }

    public void DFS(int L, int sum, int[] arr){     //타겟 넘버를 계산해줄 메서드 생성
        if(L == arr.length){                        //L(레벨)이 arr의 길이와 같을 경우
            if(sum == point){                       //합(sum)과 target의 값이 같으면 answer을 1증가
                answer++;
            }
        }else{                                      //L(레벨)이 arr의 길이와 다를 경우
            DFS(L+1,sum+arr[L],arr);        //합에 arr[]값을 더한 것을 재귀
            DFS(L+1,sum-arr[L],arr);        //합에 arr[]값을 뺀 것을 재귀
        }
    }
}
