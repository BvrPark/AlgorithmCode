package Programmers.Level1;


import java.util.*;

public class Solution15 {                                       //두 개 뽑아서 더하기
    public ArrayList<Integer> solution(int[] numbers) {
        Set<Integer> arr = new HashSet<>();                     //중복을 막기 위해 Set을 사용
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {      //이중 for문을 사용
                arr.add(numbers[i]+numbers[j]);                 //각각의 합을 arr에 중복을 제거해서 넣어줌
            }
        }
        ArrayList<Integer> list = new ArrayList<>(arr);         //arr를 ArrayList형태로 변환시켜서 넣어줌
        Collections.sort(list);                                 //오름차순으로 정렬
        return list;
    }

}
