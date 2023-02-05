class Solution {
    static boolean[][][][] map = new boolean[11][11][11][11];
    static int cx = 5, cy = 5;
    static int nx = 5, ny = 5;
    public int solution(String dirs) {
        int answer = 0;
        for(char x : dirs.toCharArray()){
            cx = nx;
            cy = ny;
            if(x == 'U'){
                ny += 1;
            }else if(x == 'D'){
                ny -= 1;
            }else if(x == 'R'){
                nx += 1;
            }else{
                nx -= 1;
            }
            if(nx > 10 || nx < 0 || ny > 10 || ny < 0){
                nx = cx;
                ny = cy;
            }else{
                if(!map[cx][cy][nx][ny]){
                    map[cx][cy][nx][ny] = true;
                    map[nx][ny][cx][cy] = true;
                    answer++;
                }
            }
        }

        return answer;
    }
}