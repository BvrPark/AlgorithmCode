import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> inter = new ArrayList<>();
        char c1, c2;
        int sum = 0;
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        for(int i = 0; i < str1.length()-1; i++){
            c1 = str1.charAt(i);
            c2 = str1.charAt(i+1);
            if(Character.isAlphabetic(c1) && Character.isAlphabetic(c2)){
                A.add(c1 +""+ c2);
            }else{
                continue;
            }
            
        }
        for(int i = 0; i < str2.length()-1; i++){
            c1 = str2.charAt(i);
            c2 = str2.charAt(i+1);
            if(Character.isAlphabetic(c1) && Character.isAlphabetic(c2)){
                B.add(c1 +""+ c2);
            }else{
                continue;
            }
            
        }
        int sizeA = A.size();
        int sizeB = B.size();
        
        for(String s: A){
            if(B.remove(s)){
                inter.add(s);
            }
        }
        sum = sizeA + sizeB - inter.size();
        if(sum == 0){
            return 65536;
        }
        answer = (int)((inter.size()/(double)sum)* 65536);
    
        return answer;
    }
    
    public boolean isAlpha(String s){
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                return true;
            }
        }
        return false;
    }
}