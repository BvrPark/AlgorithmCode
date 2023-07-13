class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer =new int[2];
        boolean[][] map=new boolean[park.length][park[0].length()];
        
        for(int i=0;i<park.length;i++){
            for(int j=0;j<park[i].length();j++){
                char cur=park[i].charAt(j);
                if(cur!='X'){
                    map[i][j]=true;
                }
                if(cur=='S'){
                    answer[0]=i;
                    answer[1]=j;
                }
            }
        }
        loop:for(int i=0;i<routes.length;i++){
            char cost=routes[i].charAt(0);
            int lange=routes[i].charAt(2)-'0';
            int cx=answer[0];
            int cy=answer[1];
            for(int j=0;j<lange;j++){
                switch(cost){
                        case'N':cx--;break;
                        case'W':cy--;break;
                        case'E':cy++;break;
                        case'S':cx++;break;
                }
                if(cx<0||cy<0||cx>=map.length||cy>=map[0].length){
                    continue loop;
                }
                if(!map[cx][cy]){
                    continue loop;
                }
            }
            answer[0]=cx;
            answer[1]=cy;
        }
        return answer;
    }
}