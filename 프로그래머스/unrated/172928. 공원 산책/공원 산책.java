import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int ix = 0;
        int iy = 0;
        
        char[][] arr = new char[park.length][park[0].length()];
        
        for(int i = 0; i < park.length; i++){
            arr[i] = park[i].toCharArray();
            
            if(park[i].contains("S")){
                iy = i;
                ix = park[i].indexOf("S");
                
            }
        }
    
        for(String st : routes){
            String way = st.split(" ")[0];
            int len = Integer.parseInt(st.split(" ")[1]);
            
            int nx = ix;
            int ny = iy;
            
            for(int i = 0; i < len; i++){
                if(way.equals("E")){
                    nx++;
                }
                if(way.equals("W")){
                    nx--;
                }
                if(way.equals("S")){
                    ny++;
                }
                if(way.equals("N")){
                    ny--;
                }
                if(nx >=0 && ny >=0 && ny < arr.length && nx < arr[0].length){
                    if(arr[ny][nx] == 'X'){
                        break;
                    }
                
                    if(i == len-1){
                        ix = nx;
                        iy = ny;
                    }
                }
            }
        }       
        
        int[] answer = {iy, ix};
        return answer;
    }
}