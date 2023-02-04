class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] check = new boolean[n];
        int answer = 0;
        
        for(int i = 0; i < n; i++){
            if(!check[i]){
                answer++;
                dfs(i, check, computers);
            }
        }
        return answer;
    }
    
    public void dfs(int i, boolean[] check, int[][] computers){
        check[i] = true;
        
        for(int j = 0; j < computers.length; j++){
            if(check[j] == false && computers[i][j] == 1){
                dfs(j, check, computers);
            }
        }
    }
}