package step8;

import java.util.Scanner;

public class Num3_1193 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int count = 1, sum = 0;             //count : 대각선의 갯수 , sum : 대각선의 갯수의 누적합

        while (true) {
            // 대각선의 갯수의 누적합 + a가 존재하는 대각선의 갯수를 해서 만약에 a가 그 값보다 작으면 a가 count값의 대각선줄에 존재하는 것이다.
            if (a <= sum + count) {

                if (count % 2 == 1) {    // 대각선의 개수가 홀수라면
                    // 분모는 큰 수부터 시작되고
                    // 분모는 대각선 개수 -(a-대각선의 누적합-1)가 되고
                    // 분자는 (a-대각선의 누적합)이 된다.
                    System.out.print((count - (a - sum - 1)) + "/" + (a - sum));
                    break;
                } else {    // 대각선의 개수가 짝수라면
                    // 홀수와 반대로 분모와 분자가 증감하므로 반대로 출력을 하면 된다.
                    System.out.print((a - sum) + "/" + (count - (a - sum - 1)));
                    break;
                }

            } else {    //만약 a가 sum+count보다 크면 count의 대각선에 존재하지 않는다는 뜻이므로
                //누적합(sum)에 해당 대각선인(count)를 증가시키고 대각선을 한칸 뒤로 옮긴다.(count++)
                sum += count;
                count++;
            }
        }
    }
}
