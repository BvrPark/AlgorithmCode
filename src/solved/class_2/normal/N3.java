package solved.class_2.normal;

import java.io.*;

//Hashing(15829번)
public class N3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        long sum = 0;
        long m = 1;

        for (int i = 0; i < N; i++) {
            sum += ((s.charAt(i)-'a'+1)*m);
            m = (m*31) % 1234567891;
        }
        System.out.println(sum%1234567891);
    }
}
