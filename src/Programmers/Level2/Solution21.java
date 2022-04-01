package Programmers.Level2;

public class Solution21 {
    public int solution(String skill, String[] skill_trees) {   //스킬트리
        int answer = 0;                                         //스킬트리 갯수
        for(String x : skill_trees){                            //skill_trees에 있는 스킬트리 하나씩 뽑아서
            String tmp = x;
            for(int i = 0; i < x.length();i++){                 //스킬트리에서 선행스킬을 제외한 모든 스킬을 없애서 tmp에 넣는다.
                String s = x.substring(i,i+1);
                if(!skill.contains(s)){
                    tmp = tmp.replace(s,"");
                }
            }
            if(skill.indexOf(tmp)==0){          //tmp가 선행스킬 순서에 존재하면 스킬트리 갯수에 +1
                answer++;
            }
        }
        return answer;
    }
}
