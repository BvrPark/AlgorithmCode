package Programmers.Level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution40 {
    public int[] solution(String[] id_list, String[] report, int k) {   //신고 결과 받기
        int[] answer = new int[id_list.length];
        HashSet<String> check = new HashSet<>();
        for(String s : report){                         //report의 중복을 제거해서 다시 저장
            check.add(s);
        }
        // 신고 받은 사람에 따라 누가 신고했는지 HashMap형태로 저장
        HashMap<String, ArrayList<String>> singo = new HashMap<>();
        for(String s : check){                          //신고한 사람을 reportId, 신고받은 사람을 reportedId로 저장
            String[] arr = s.split(" ");
            String reportId = arr[0], reportedId = arr[1];
            //list를 생성해서 신고 받은 사람이 있으면 그 값을 생성, 없으면 null저장
            ArrayList<String> list = singo.getOrDefault(reportedId, null);
            if(list == null){
                list = new ArrayList<>();
            }
            list.add(reportId);         //list에 신고한 사람을 저장
            singo.put(reportedId,list); //singo에 <신고받은 사람, 신고한사람> 순으로 저장
                                        //신고 받은 사람이 중복이 안되게 key값으로 저장
        }

        HashMap<String, Integer> countId = new HashMap<>(); //신고한 사람이 몇번 연락이 오는지 count하는 HashMap생성
        for(ArrayList<String> list : singo.values()){       //신고한 사람들이 k명 이상일때,
            if(list.size()>=k){
                for(String reporter : list){                //HashMap에 신고한 사람들을 count해서 저장
                    countId.put(reporter,countId.getOrDefault(reporter,0)+1);
                }
            }
        }

        for(int i = 0;i<id_list.length;i++){                //신고한 사람이 없으면 0을 대입, 있으면 그 사람 갯수만큼 대입
            answer[i] = countId.getOrDefault(id_list[i],0);
        }
        return answer;
    }
}
