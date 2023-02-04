import java.util.*;

class Solution {
    
    public static int[] dx = {1,-1,0,0};
    public static int[] dy = {0,0,1,-1};
    
    public int solution(int[][] maps) {
        return bfs(0,0,maps);
    }
    
    public int bfs(int x, int y, int[][] maps){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x,y));
        int n = maps.length;
        int m = maps[0].length;
        
        while(!q.isEmpty()){
            Node node = q.poll();
            x = node.getX();
            y = node.getY();
            
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx >= n || ny >= m || nx < 0 || ny < 0){
                    continue;
                }
                if(maps[nx][ny] == 0){
                    continue;
                }
                if(maps[nx][ny] == 1){
                    maps[nx][ny] = maps[x][y] + 1;
                    q.offer(new Node(nx, ny));
                }
            }
        }
        
        if(maps[n-1][m-1] != 1){
            return maps[n-1][m-1];
        }else{
            return -1;
        }
        
    }
}

class Node{
    private int x;
    private int y;
    
    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
}