package Programmers.Level1;

public class Solution36 {
    public int solution(String dartResult) {    //다트 게임
        int answer = 0, index = 0;
        int[] arr = new int[3];     //다트 점수를 저장할 배열 생성
        String tmp = "";            //점수를 임시로 저장할 곳

        for(int i = 0; i<dartResult.length();i++){  //문자열 길이만큼 반복 작업
            switch (dartResult.charAt(i)){          //문자열에서 문자 1개를 떼서 따로 비교
                case 'S':           //S가 들어올 경우
                    arr[index++] = (int)Math.pow(Integer.parseInt(tmp),1);//들어온 점수를 1제곱 후 배열에 저장 후 index값 증가
                    tmp = "";       //점수를 임시로 저장하는 곳 초기화
                    break;

                case 'D':           //D가 들어올 경우
                    arr[index++] = (int) Math.pow(Integer.parseInt(tmp), 2);//들어온 점수를 2제곱 후 배열에 저장,index값 증가
                    tmp = "";       //점수를 임시로 저장하는 곳 초기화
                    break;

                case 'T':           //T가 들어올 경우
                    arr[index++] = (int) Math.pow(Integer.parseInt(tmp), 3);//들어온 점수를 3제곱 후 배열에 저장,index값 증가
                    tmp = "";
                    break;

                case '*':           //*가 들어올 경우
                    arr[index-1]*=2;//배열의 index-1에 들어있는 값을 2배하고
                    if(index>1){    //만약 index-1이 첫번째 값이 아니라면
                        arr[index-2]*=2; //배열의 index-2에 들어있는 값도 2배를 한다.
                    }
                    break;

                case '#':           //#가 들어올 경우
                    arr[index-1]*=-1;//배열의 index-1에 들어있는 값을 -1배한다.
                    break;

                default:            //그외(숫자)가 들어올 경우
                    tmp += String.valueOf(dartResult.charAt(i));//임시저장하는 곳에 값을 저장

            }
        }
        for(int x : arr){           //배열의 값들을 다 더해서 answer에 저장
            answer += x;
        }
        return answer;
    }
}
