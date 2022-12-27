package solved.class_2.normal;

import java.util.*;
import java.io.*;

//스택 수열(1874번)
public class N10 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int count = 1;

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            while(count <= N+5){
                if(stack.empty()){
                    stack.push(count);
                    sb.append("+").append("\n");
                    count++;
                }else{
                    if(stack.peek() < a){
                        stack.push(count);
                        sb.append("+").append("\n");
                        count++;
                    }else if(stack.peek() > a){
                        stack.pop();
                        sb.append("-").append("\n");
                    }else{
                        stack.pop();
                        sb.append("-").append("\n");
                        break;
                    }
                }
            }
        }
        if(count > N+5){
            System.out.println("NO");
        }else{
            System.out.println(sb);
        }
    }
}
