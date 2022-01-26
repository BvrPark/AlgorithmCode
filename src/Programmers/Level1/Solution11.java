package Programmers.Level1;

public class Solution11 {
    public String solution(String str) {
        str = str.toLowerCase().replaceAll("[^-_.a-z0-9]","");
        //모든 대문자를 대응되는 소문자로 치환하고
        //알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        str = str.replaceAll("[.]+",".");   //마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        str = str.replaceAll("^[.]|[.]$","");   //마침표(.)가 처음이나 끝에 위치한다면 제거

        if(str.equals("")){     //빈 문자열이라면, str에 "a"를 대입
            str += "a";
        }
        if(str.length()>=16){           //str의 길이가 16자 이상이면,
            str = str.substring(0,15);  //str의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
            str = str.replaceAll("[.]$","");    //제거 후 마침표(.)가 str의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
        }

        if(str.length()<3){         //str 길이가 2자 이하라면
            while(str.length()<3){
                str += str.charAt(str.length()-1);  //, str의 마지막 문자를 str의 길이가 3이 될 때까지 반복해서 끝에 붙임.
            }
        }
        return str;
    }
}

