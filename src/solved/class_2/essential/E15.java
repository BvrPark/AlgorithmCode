package solved.class_2.essential;

import java.util.*;
import java.io.*;

//스택(10828번)
//큐(10845번)와 풀이 방법이 거의 똑같다.
public class E15 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String s = st.nextToken();

            switch(s){
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    if(stack.isEmpty()){
                        sb.append("-1").append('\n');
                    }else{
                        sb.append(stack.pop()).append('\n');
                    }
                    break;

                case "size":
                    sb.append(stack.size()).append('\n');
                    break;

                case "empty":
                    if (stack.isEmpty()) {
                        sb.append("1").append('\n');
                    } else {
                        sb.append("0").append('\n');
                    }
                    break;

                case "top":
                    if (stack.isEmpty()) {
                        sb.append("-1").append('\n');
                    }else{
                        sb.append(stack.peek()).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);

    }
}
