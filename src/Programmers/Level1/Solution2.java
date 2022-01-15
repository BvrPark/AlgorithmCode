package Programmers.Level1;

public class Solution2 {
    public int solution(String s) {
        int answer = 0;
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < arr.length; i++) {
            s = s.replaceAll(arr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }

}
