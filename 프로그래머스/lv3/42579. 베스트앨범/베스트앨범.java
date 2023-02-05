import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        //장르 별 재생 수
        Map<String,Integer> m = new HashMap<>();
        for(int i = 0; i < genres.length; i++){
            m.put(genres[i], m.getOrDefault(genres[i],0) + plays[i]);
        }
        
        //재생 수에 따라서 장르 정렬
        ArrayList<String> keySet = new ArrayList<>(m.keySet());
        Collections.sort(keySet, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return m.get(s2).compareTo(m.get(s1));
            }
        });
        
        ArrayList<Integer> ans = new ArrayList<>();
        //장르에서 첫번째 노래 뽑음
        for(int i = 0; i < keySet.size(); i++){
            String s = keySet.get(i);
            int max = 0;
            int first = 0;
            
            for(int j = 0; j < genres.length; j++){
                if(s.equals(genres[j]) && max < plays[j]){
                    max = plays[j];
                    first = j;
                }
            }
            
            //장르에서 두번째 노래 뽑음
            max = 0;
            int sec = -1;
            
            for(int k = 0; k < genres.length; k++){
                if(s.equals(genres[k]) && max < plays[k] && first != k){
                    max = plays[k];
                    sec = k;
                }
            }
            
            ans.add(first);
            if(sec >= 0){
                ans.add(sec);
            }
        }
        
        int[] answer = new int[ans.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }
}