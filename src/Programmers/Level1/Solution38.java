package Programmers.Level1;

import java.util.Arrays;

public class Solution38 {
    public int solution(int n, int[] lost, int[] reserve) { //체육복 문제
        int answer = n-lost.length;         //미리 도난당한 사람들의 수를 뺀다.
        Arrays.sort(lost);
        Arrays.sort(reserve);               //오름차순으로 정렬해주고

        for(int i = 0;i<lost.length;i++){
            for(int j = 0;j<reserve.length;j++){
                if(lost[i] == reserve[j]){  //만약 도난 당한 사람들과 여벌의 체육복을 가져온 사람이 같으면
                    answer++;               //그럼 체육수업듣는데 지장이 없으므로 다시 더해준다.
                    lost[i] = -10;          //도난 당했지만 여벌의 체육복이 있으므로 도난 당한 사람들의 목록에서 제외
                    reserve[j] = -10;       //여벌의 체육복이 있지만 못빌려주므로 목록에서 제외
                    break;                  //굳이 그 뒤까지 반복문을 돌릴 필요가 없으므로 break;
                }
            }
        }
        for(int k = 0;k<lost.length;k++){
            for(int l = 0;l<reserve.length;l++){
                if(lost[k] == reserve[l]-1||lost[k] == reserve[l]+1){   //도난 당한 사람의 앞,뒤번호 사람이 여벌의 체육복을 가져온 경우
                    answer++;               //체육수업을 듣는데 지장이 없으므로 사람수를 더해준다.
                    reserve[l] = -10;       //그때 여벌의 옷을 가진 사람은 체육복을 빌려줬으므로 목록에서 제외
                    break;                  //그뒤 반복문을 돌릴 필요가 없으므로 break;
                }
            }
        }

        return answer;
    }
}
