package solved.class_2.normal;

import java.io.*;
import java.util.*;

//균형잡힌 세상(4949번)
public class N8 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        Stack<Character> stack;

        while (true) {
            str = br.readLine();
            stack = new Stack<>();
            if (str.equals(".")) {
                break;
            } else {
                for (int i = 0; i < str.length(); i++) {
                   char c = str.charAt(i);
                   if(c == '(' || c == '['){
                       stack.push(c);
                   }else if(c == ')'){
                       if(stack.empty() || stack.peek() != '('){
                           stack.push(c);
                           break;
                       }else{
                           stack.pop();
                       }
                   }else if(c == ']'){
                       if(stack.empty() || stack.peek() != '['){
                           stack.push(c);
                           break;
                       }else{
                           stack.pop();
                       }
                   }
                }
                if (stack.empty()) {
                    sb.append("yes").append("\n");
                } else {
                    sb.append("no").append("\n");
                }
            }
        }
        System.out.println(sb);
    }

}
