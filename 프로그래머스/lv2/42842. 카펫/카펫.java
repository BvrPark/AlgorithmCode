class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // w : 가로, l : 세로
        int w,l;
        int n = brown/2;
        
        for(int i = 3; i < n; i++){
            w = i;
            l = n - w;
            if((w-2)*l == yellow){
                answer[0] = l+2;
                answer[1] = w;
                break;
            }
        }
        
        
        return answer;
    }
}