package Programmers;

import java.util.*;

public class TestCase {
    public int solution(int[] people, int limit) {  //구명보트
        int answer = 0;
        int first = 0;
        List<Integer> list = new ArrayList<>();
        for(int i : people){            // Arraylist에 몸무게 정보 대입
            list.add(i);
        }
        Collections.sort(list);         // 사람들을 몸무게 순으로 오름차순으로 정렬
        while(list.size() != 0){        // 사람들이 없을때까지 반복
            if(list.size() == 1){       // 사람이 1명 남았을 경우
                list.remove(0);   // 보트에 태워보낸다.
                answer += 1;
            }else{
                if(list.get(first) + list.get(list.size()-1) <= limit){ //제일 가벼운 사람 + 무거운 사람이 제한 무게보다 작거나 같을 경우
                    list.remove(first);                 // 제일 가벼운 사람과 무거운 사람을 보트에 태워 보낸다.
                    list.remove(list.size()-1);
                }else{                                  // 제한 무게보다 무거울 경우
                    list.remove(list.size()-1);   // 무거운 사람만 보트에 태워보낸다.
                }
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        TestCase test = new TestCase();
        int[] array = {70,50,80,50};
        System.out.println(test.solution(array,100));
    }
}
