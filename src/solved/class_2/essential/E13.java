package solved.class_2.essential;

import java.util.*;
import java.io.*;

//덱(10866번)
public class E13 {

    public static void main(String[] args) throws IOException {

        //입력 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //덱을 저장할 LinkedList세팅
        LinkedList<Integer> deque = new LinkedList<>();
        //한번에 출력을 위한 StringBuilder세팅
        StringBuilder sb = new StringBuilder();
        //명령의 수 입력
        int n = Integer.parseInt(br.readLine());
        //임시로 명령어를 저장할 공간 생성
        String s;

        for (int i = 0; i < n; i++) {
            //입력받은 명령을 공백을 기준으로 나눈다.
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            //명령어를 s에 저장한다.
            s = st.nextToken();

            //명령어가 "push_front"일때,
            if(s.equals("push_front")){
                deque.addFirst(Integer.parseInt(st.nextToken()));
            //명령어가 "push_back"일때,
            }else if(s.equals("push_back")){
                deque.addLast(Integer.parseInt(st.nextToken()));
            //명령어가 "pop_front"일때
            }else if(s.equals("pop_front")){
                if(deque.isEmpty()){
                    sb.append("-1").append('\n');
                }else {
                    sb.append(deque.removeFirst()).append('\n');
                }
            //명령어가 "pop_back"일때
            }else if(s.equals("pop_back")){
                if(deque.isEmpty()){
                    sb.append("-1").append('\n');
                }else {
                    sb.append(deque.removeLast()).append('\n');
                }
            //명령어가 "size"일때
            }else if(s.equals("size")){
                sb.append(deque.size()).append('\n');
            //명령어가 "empty"일때
            }else if(s.equals("empty")){
                if(deque.isEmpty()){
                    sb.append('1').append('\n');
                }else{
                    sb.append('0').append('\n');
                }
            //명령어가 "front"일때
            }else if(s.equals("front")){
                if(deque.isEmpty()){
                    sb.append("-1").append('\n');
                }else {
                    sb.append(deque.getFirst()).append('\n');
                }
            //명령어가 "back"일떄
            }else if(s.equals("back")){
                if(deque.isEmpty()){
                    sb.append("-1").append('\n');
                }else {
                    sb.append(deque.getLast()).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
