package solved.class_2.essential;

import java.util.*;
import java.io.*;

//괄호 문제(9012번)
public class E12 {

    public static void main(String[] args) throws IOException {

        //입력 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //vps를 판별할 Stack 생성
        Stack<Character> vps = new Stack<>();
        //한번에 출력할 StringBuilder 생성
        StringBuilder sb = new StringBuilder();
        //갯수 입력
        int n = Integer.parseInt(br.readLine());
        //입력된 문자열을 저장할 배열 생성
        String[] arr = new String[n];


        LOOP1:
        for (int i = 0; i < n; i++) {
            //배열에 문자열을 입력
            arr[i] = br.readLine();
            for (int j = 0; j < arr[i].length(); j++) {
                //배열에 들어간 문자열을 문자단위로 쪼개서 하나하나 판별
                char c = arr[i].charAt(j);
                //만약 "("가 문자로 들어왔으면 Stack에 넣는다.
                if(c == '('){
                    vps.push(c);
                //만약 반복문이 안 끝났는데 vps가 비었으면(")"가 "("보다 많은 것이므로 NO를 sb에 추가하고 안쪽 반복문을 종료
                }else if(vps.empty()){
                    sb.append("NO").append('\n');
                    continue LOOP1;
                //"("이 아닌 다른 문자 : ")"가 들어왔으면 pop을 해서 Stack에 넣었던 "("을 반환
                }else{
                    vps.pop();
                }
            }
            //위의 모든 과정이 끝났을 때 vps가 비어있으면 = vps의 괄호의 방향과 갯수가 올바르면 YES를 sb에 추가
            if(vps.empty()){
                sb.append("YES").append('\n');
            //위의 모든 과정이 끝났을 때 vps가 아직 남아있으면 = vps에 괄호의 갯수나 방향이 다르면 NO를 sb에 추가
            }else{
                sb.append("NO").append('\n');
            }
            //반복문 하나가 끝났을 때, Stack을 초기화
            vps.clear();
        }
        System.out.println(sb);

    }
}

