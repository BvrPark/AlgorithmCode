package Programmers.Level1;

public class Solution8 {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0;i<nums.length;i++){           // 삼중 for문으로 nums배열 안의 서로 다른 수 3개를 일일히 다 더함.
            for(int j = i+1; j<nums.length;j++){
                for(int k = j+1;k<nums.length;k++){
                    int num = nums[i]+nums[j]+nums[k];  //다 더한 값을 num에 저장
                    if(sosu(num)){                      //소수임을 판단하는 메서드에 넣고 소수일 시 answer을 증가
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    public boolean sosu(int num){       //소수를 판단하는 메서드
        for(int i = 2; i<num;i++){      //소수를 판단하는 마땅한 메서드가 없어서 직접 만들어서 씀
                                        //판단하는 방법은 블로그에 적어놓겠다.
            if(num%i ==0){
                return false;
            }

        }
        return true;
    }
}
