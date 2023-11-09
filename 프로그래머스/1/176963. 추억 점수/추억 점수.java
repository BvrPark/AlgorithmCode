class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++){
            int sum = 0;
            for(int j = 0; j < name.length; j++){
                for(int k = 0; k < photo[i].length; k++){
                    String s = photo[i][k];
                    if(name[j].equals(s)){
                        sum += yearning[j];
                    }
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}