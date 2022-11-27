package solved.class_2.essential;

import java.util.*;
import java.io.*;

//카드2(2164번)
public class E16 {

    public static void main(String[] args) throws IOException {
        //입력 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //카드를 저장할 공간
        Queue<Integer> card = new LinkedList<>();
        //n장의 카드를 입력
        int n = Integer.parseInt(br.readLine());
        //1부터 n까지 카드를 차례대로 쌓는다.
        for (int i = 0; i < n; i++) {
            card.add(i + 1);
        }

        //card의 갯수가 1이 되면 종료
        //card의 제일 앞의 수를 제거한뒤,
        //그 다음 수를 제거하여 제일 뒤로 갖다붙임
        while(card.size()!=1){
            card.remove();
            card.add(card.remove());
        }
        
        //card의 갯수가 1개일때, 그 수를 출력
        System.out.println(card.peek());
    }

}
