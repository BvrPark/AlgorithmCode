import java.util.*;

class Node{
    private String str;
    private int count;
    
    public Node(String str, int count){
        this.str = str;
        this.count = count;
    }
    
    public String getS(){
        return this.str;
    }
    public int getC(){
        return this.count;
    }
}

class Solution {
    static boolean[] check;
    
    public int solution(String begin, String target, String[] words) {
        check = new boolean[words.length];
        return bfs(begin, target, words);
    }
    
    public int bfs(String begin, String target, String[] words){
        Queue<Node> q = new LinkedList<>();
        int differ = 0;
        q.offer(new Node(begin,0));
        
        while(!q.isEmpty()){
            Node node = q.poll();
            if(node.getS().equals(target)){
                return node.getC();
            }
            
            for(int i = 0; i < words.length; i++){
                differ = 0;
                for(int j = 0; j < words[i].length(); j++){
                    if(node.getS().charAt(j) != words[i].charAt(j)){
                        differ += 1;
                    }
                }
                
                if(differ == 1 && check[i] == false){
                    check[i] = true;
                    q.offer(new Node(words[i],node.getC()+1));
                }
            }
            
        }
        
        return 0;
        
        
    }
}