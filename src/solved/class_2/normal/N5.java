package solved.class_2.normal;

import java.io.*;

//영화감독 숌(1436번)
public class N5 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int num = 666;

        while(count != N){
            num++;
            if(String.valueOf(num).contains("666")){
                count++;
            }
        }

        System.out.println(num);
    }
}
