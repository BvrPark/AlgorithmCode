package solved.class_2.normal;

import java.io.*;
import java.util.*;

//프린터 큐(1966번)
public class N12 {

    static class Printer {
        int index;
        int pri;

        public Printer(int index, int pri) {
            this.index = index;
            this.pri = pri;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Queue<Printer> q = new LinkedList<>();
        int idx;
        int count;

        int num = Integer.parseInt(br.readLine());  //테스트 케이스 갯수

        for (int i = 0; i < num; i++) {
            idx = 0;
            count = 0;
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());   //문서의 갯수
            int M = Integer.parseInt(st.nextToken());   //몇 번째?
            q.clear();

            String[] s = br.readLine().split(" ");

            for (int j = 0; j < s.length; j++) {
                q.add(new Printer(idx,Integer.parseInt(s[j])));
                idx++;
            }

            while(!q.isEmpty()){
                Printer p = q.poll();
                for(Printer x : q){
                    if(x.pri > p.pri){
                        q.add(p);
                        p = null;
                        break;
                    }
                }
                if(p != null){
                    count++;
                    if(p.index == M){
                        sb.append(count).append("\n");
                        break;
                    }
                }
            }
        }
        System.out.println(sb);

    }


}
