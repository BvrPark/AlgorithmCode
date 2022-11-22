package solved.class_2.essential;

import java.util.*;

//단어 정렬(1181번)
public class E6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                 //입력 받을 단어의 수
        String[] arr = new String[n];         //입력 받을 단어만큼 배열 생성
        sc.nextLine();                        //nextInt()후 바로 nextLine()쓰면 처음에 공백이 입력되서 미리 한번 없애줌

        for(int i = 0; i< n;i++){             //단어 입력
            arr[i] = sc.nextLine();
        }
        Arrays.sort(arr,new Comparator<String>(){       //블로그에 기재
            @Override
            public int compare(String s1, String s2){
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }else{
                    return s1.length() - s2.length();
                }
            }
        });

        System.out.println(arr[0]);
        for(int i = 1; i < n ; i++){
            if(!arr[i].equals(arr[i-1])){               //단어가 같지 않는 것만 출력
                System.out.println(arr[i]);
            }
        }
    }
}
