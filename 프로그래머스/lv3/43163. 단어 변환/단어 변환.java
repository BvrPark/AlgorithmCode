import java.util.*;

class Solution {
    static int answer = 0;
    static boolean[] check;
    
    public int solution(String begin, String target, String[] words) {
        check = new boolean[words.length];
        bfs(begin, target, words);    
        return answer;
    }
    
    public void bfs(String begin, String target, String[] words){
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(begin, 0));
        
        while(!q.isEmpty()){
            Node node = q.poll();
            if(node.getW().equals(target)){
                answer = node.getC();
                return;
            }
            int differ = 0;
            for(int i = 0; i < words.length; i++){
                differ = 0;
                if(check[i]){
                    continue;
                }
                for(int j = 0; j < begin.length(); j++){
                    if(node.getW().charAt(j) != words[i].charAt(j)){
                        differ++;
                    }
                }
                if(differ == 1){
                    check[i] = true;
                    q.add(new Node(words[i],node.getC()+1));
                }
            }
        }
    }
}

class Node{
    private String word;
    private int count;
    
    public Node(String word, int count){
        this.word = word;
        this.count = count;
    }
    
    public String getW(){
        return this.word;
    }
    
    public int getC(){
        return this.count;
    }
}