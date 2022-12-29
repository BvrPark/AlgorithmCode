package solved.class_2.normal;

import java.util.*;
import java.io.*;

//제로(10773번)
public class N9 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a == 0){
                stack.pop();
            }else{
                stack.push(a);
            }
        }

        for (int i : stack) {
            sum += i;
        }
        System.out.println(sum);
    }
}
