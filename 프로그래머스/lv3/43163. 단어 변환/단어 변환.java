class Solution {
    static boolean[] check;
    static int answer = 0;

    public int solution(String begin, String target, String[] words) {
        check = new boolean[words.length];
        bfs(begin, target, words, 0);
        return answer;
    }

    public void bfs(String begin, String target, String[] words, int count){
        if(begin.equals(target)){
            answer = count;
            return;
        }

        int differ = 0;

        for(int i = 0; i < words.length; i++){
            if(check[i]){
                continue;
            }

            differ = 0;

            for(int j = 0; j < begin.length(); j++){
                if(begin.charAt(j) != words[i].charAt(j)){
                    differ++;
                }
            }

            if(differ == 1){
                check[i] = true;
                bfs(words[i],target,words,count+1);
                check[i] = false;
            }
        }


    }
}