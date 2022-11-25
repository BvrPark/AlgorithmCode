package solved.class_2.essential;

import java.util.*;
import java.io.*;

//큐(10845번)
public class E14 {
    public static void main(String[] args) throws IOException {
        //입력 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //한번에 모아서 출력할 StringBuilder생성
        StringBuilder sb = new StringBuilder();
        //큐를 저장할 que생성
        Queue<Integer> que = new LinkedList<>();
        //임시로 숫자를 저장할 곳
        int put = 0;

        //명령의 갯수 입력
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            //입력한 명령을 우선 s에 저장
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String s = st.nextToken();
            //명령에 따라 다른 switch - case문 실행
            switch (s){
                //명령이 "push"일때
                case "push":
                    put = Integer.parseInt(st.nextToken());
                    que.add(put);
                    break;
                //명령이 "pop"일떄
                case "pop":
                    if(que.isEmpty()){
                        sb.append("-1").append('\n');
                    }else{
                        sb.append(que.remove()).append('\n');
                    }
                    break;
                //명령이 "size"일때
                case "size":
                    sb.append(que.size()).append('\n');
                    break;
                //명령이 "empty"일때
                case "empty":
                    if(que.isEmpty()){
                        sb.append("1").append('\n');
                    }else{
                        sb.append("0").append('\n');
                    }
                    break;
                //명령이 "front"일때
                case "front":
                    if(que.isEmpty()){
                        sb.append("-1").append('\n');
                    }else{
                        sb.append(que.peek()).append('\n');
                    }
                    break;
                //명령이 "back"일때
                case "back":
                    if(que.isEmpty()){
                        sb.append("-1").append('\n');
                    }else{
                        sb.append(put).append('\n');
                    }
            }
        }

        System.out.println(sb);
    }
}
