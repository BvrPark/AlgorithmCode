import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(palin(s)){
                answer++;
            }
            s = s.substring(1) + s.charAt(0);
        }
        return answer;
    }
    
    public boolean palin(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '('){
                stack.push(')');
            }else if(c == '['){
                stack.push(']');
            }else if(c == '{'){
                stack.push('}');
            }else if(stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
}