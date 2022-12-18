package solved.class_2.normal;

import java.io.*;
import java.util.*;

//직사각형에서 탈출(1085번)
public class N1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int min = Math.min(x, w - x);
        min = Math.min(min, y);
        min = Math.min(min, h - y);
        System.out.println(min);
    }
}
