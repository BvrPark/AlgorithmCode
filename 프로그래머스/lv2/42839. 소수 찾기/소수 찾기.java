import java.util.*;

class Solution {
    
    static Set<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        String[] str = numbers.split("");
        boolean[] check = new boolean[str.length];
        dfs(str, check,"",0);
        return set.size();
    }
    
    public void dfs(String[] str, boolean[] check, String s, int count){
        if(count == check.length){
            return;
        }
        for(int i = 0; i < str.length; i++){
            if(!check[i]){
                check[i] = true;
                String tmp = s + str[i];
                if(prime(Integer.parseInt(tmp))){
                    set.add(Integer.parseInt(tmp));
                }
                dfs(str,check,tmp,count+1);
                check[i] = false;
            }
        }
    }
    
    public boolean prime(int n){
        if(n < 2){
            return false;
        }
      
        for(int i = 2; i*i <=n; i++){
            if((n % i) == 0){
                return false;
            }
        }
        return true;
    }
}