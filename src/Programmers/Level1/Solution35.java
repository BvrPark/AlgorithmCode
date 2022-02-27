package Programmers.Level1;

public class Solution35 {
    public String[] solution(int n, int[] arr1, int[] arr2) {   //비밀지도
        String[] answer = new String[n];
        String[] array1 = new String[n];
        String[] array2 = new String[n];
        for (int i = 0; i < n; i++) {
            array1[i] = binary(n,arr1[i]);  //이진법으로 바꿔서 자리수까지 맞춘 값을 배열에 넣음
            array2[i] = binary(n,arr2[i]);
        }
        for (int i = 0; i < n; i++) {
            answer[i] = "";
            for(int j = 0;j<array1[i].length();j++){
                if(array1[i].charAt(j) != array2[i].charAt(j)){ //배열끼리 비교해서 값이 다르면 #추가
                    answer[i] += "#";
                }else{                                          //값이 같을 때 그 값이 1이면 #추가 아니면 공백추가
                    if(array1[i].charAt(j)=='1'){
                        answer[i] += "#";
                    }else{
                        answer[i] += " ";
                    }
                }
            }
        }
        return answer;
    }

    public String binary(int num, int n) {  //이진법으로 변형시키고 자릿수를 맞춰주는 함수
        String s = "";
        while (n > 0) {
            s = n % 2 + s;
            n = n / 2;
        }
        while(s.length()<num){
            s = "0" + s;
        }
        return s;
    }
}
