package Programmers.Level1;

import java.util.Arrays;

public class Solution4 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];                //commands의 크기만큼 answer를 지정해줌
        int[] arr = {};                                         //빈 배열 1개 생성
        for(int i = 0; i<commands.length;i++){
            arr = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            //빈 배열에 array배열에서 i번째부터 k번째까지 복사해서 arr에 넣어줌
            Arrays.sort(arr);                   //arr를 오름차순으로 정렬
            answer[i] = arr[commands[i][2]-1];  //answer[i]번째에 arr를 오름차순으로 정렬한 것 중 k번째 해당하는 수를 넣는다.
       }
        return answer;
    }
}
