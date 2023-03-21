import java.util.*;

class Solution {
    public int[] dx = {-1, 0, 1, 0};
    public int[] dy = {0, 1, 0, -1};
    public char[][] map;
    public boolean[][] visited;
    
    public int solution(String[] board) {
        int answer = 0;
        map = new char[board.length][board[0].length()];
        visited = new boolean[map.length][map[0].length];
        Node start = null;
        Node end = null;
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[0].length; j++) {
                map[i][j] = board[i].charAt(j);
                if(map[i][j] == 'R')
                    start = new Node(i, j, 0);
                if(map[i][j] == 'G')
                    end = new Node(i, j, 0);
            }
        }
        answer = bfs(start, end);
        return answer;
    }
    
    public Node getNode(int index, Node now) {
        int x = now.x , y = now.y;
        int ix = dx[index];
        int iy = dy[index];
        while(x + ix >= 0 && x + ix < map.length 
              && y + iy >= 0 && y + iy < map[0].length
                && map[x + ix][y + iy] != 'D') 
        {
            x += ix;
            y += iy;
        }

        return new Node(x, y, now.level + 1);
    }
    
    
     public int bfs(Node start, Node end) {
        Queue<Node> q = new LinkedList<>();
        visited[start.x][start.y] = true;
        q.add(start);
        
        while(!q.isEmpty()) {
            Node now = q.poll();
            int x = now.x;
            int y = now.y;
            int level = now.level;
            if(x == end.x && y == end.y)
                return level;
            for(int i = 0; i < 4; i++) {
                Node next = getNode(i, now);            
                if(!visited[next.x][next.y]) {
                    visited[next.x][next.y] = true;
                    q.add(next);
                }
            }
        }
        return -1;
    }
}

class Node {
    int x, y;
    int level;
    
    Node(int x, int y, int level) {
        this.x = x;
        this.y = y;
        this.level = level;
    }
}