package Programmers.Level2;

import java.util.Arrays;

public class Solution36 {
    public int solution(int[] people, int limit) {          //구명보트
        int answer = 0;
        Arrays.sort(people);                                //가벼운 사람에서 무거운 사람순으로 정렬
        int min = 0;
        int max = people.length - 1;
        for (int m = max; min <= m; m--) {
            if (people[min] + people[m] <= limit){          // 제일 가벼운 사람과 무거운 사람의 무게 합이 제한무게보다 작을 경우
                min++;                                      // 두 사람다 태워보낸다.
            }                                               // 아니면 무거운 사람만 태워보낸다.
            answer++;
        }

        return answer;
    }
}
