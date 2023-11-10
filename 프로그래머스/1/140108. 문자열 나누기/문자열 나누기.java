class Solution {
    public int solution(String s) {
        int answer = 1;
        char x = s.charAt(0);
        int countX = 1;
        int countY = 0;
        for(int i = 1; i < s.length()-1; i++){
            if(x == s.charAt(i)){
                countX++;
            }else{
                countY++;
            }
            if(countX == countY){
                answer++;
                countX = 0;
                countY = 0;
                x = s.charAt(i+1);
            }
        }
        return answer;
    }
}