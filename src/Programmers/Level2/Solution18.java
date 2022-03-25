package Programmers.Level2;

import java.util.Arrays;
import java.util.Comparator;

public class Solution18 {
    public String solution(int[] numbers) {         //가장 큰 수
        String answer = "";
        String[] arr = new String[numbers.length];  //int배열을 넣을 String배열 새로 생성
        for(int i = 0; i < numbers.length; i++){    //int배열을 String배열로 변경시켜서 대입
            arr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr,new Comparator<String>(){   //String 배열을 특별한 방식으로 내림차순으로 변경
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        for(String x : arr){                        //내림차순으로 정렬한 String배열을 answer에다가 넣음
            answer += x;
        }
        if(arr[0].equals("0")){                     //모든 배열이 0인 경우도 있으므로 그땐 0을 return
            return "0";
        }

        return answer;
    }
}
