package Programmers.Level2;

import java.util.LinkedList;

public class Solution45 {                                   //캐시
    static final int CASH_HIT = 1;
    static final int CASH_MISS = 5;

    public int solution(int cacheSize, String[] cities) {   //자세한 풀이는 블로그에 기재
        int answer = 0;
        LinkedList<String> q = new LinkedList<>();
        if (cacheSize == 0) {
            return CASH_MISS * cities.length;
        } else {
            for (int i = 0; i < cities.length; i++) {
                String city = cities[i].toUpperCase();
                if(!q.contains(city)){
                    if(q.size() < cacheSize){
                        q.add(city);
                        answer += CASH_MISS;
                    }else{
                        q.removeFirst();
                        q.add(city);
                        answer += CASH_MISS;
                    }
                }else{
                    q.remove(q.indexOf(city));
                    q.add(city);
                    answer += CASH_HIT;
                }
            }
        }
        return answer;
    }
}
