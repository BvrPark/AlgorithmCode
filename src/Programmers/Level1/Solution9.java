package Programmers.Level1;
import java.util.*;

public class Solution9 {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); //중복의 제거를 위해 HashSet 특징을 사용
        int h_nums = nums.length/2; //배열의 길이의 반을 h_nums라고 설정
        for(int n : nums){          //배열 nums에서 숫자들의 중복제거
            set.add(n);
        }
        if(set.size()>=h_nums){     //중복을 제거했을 때 길이가 h_nums보다 크거나 같을 경우
            return h_nums;          //종류가 아무리 다양해도 최대로 선택할 수 있는 종류가 h_nums이므로 h_nums반환
        }else{                      //중복을 제거했을 때 길이가 h_nums보다 작을 경우
            return set.size();      //그때의 중복을 제거한 숫자가 최대로 선택할 수 있는 종류이므로 set.size()를 반환
        }

    }
}
