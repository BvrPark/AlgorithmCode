package Programmers.Level1;

public class Solution6 {
    public int solution(int[] numbers) {
        boolean[] arr = new boolean[10];        //boolean배열은 기본적으로 생성하면 다 false값을 가진다.
        for(int num: numbers) {                 //numbers배열에 들어있는 값들을 arr[]에 넣어서 true로 바꿔준다.
            arr[num] = true;
        }
        int answer = 0;                         //답을 적을 answer변수 생성
        for(int i = 0; i < arr.length; i++) {   //arr배열의 길이만큼 반복한다.
            if(!arr[i]) {                       //arr[]의 값이 true가 아닐경우 numbers배열에 없는 것이므로
                answer += i;                    //그때의 i값을 answer에 더해준다.
            }
        }
        return answer;
    }
}
