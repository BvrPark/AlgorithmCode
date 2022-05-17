package Programmers.Level2;

public class Solution31 { //괄호변환
    public static boolean check(String s) {  //올바른 괄호 판단
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {         // (일경우 cnt+1
                cnt++;
            } else {                          // )일경우 cnt-1
                cnt--;
                if (cnt < 0) {                  // )를 만나서 cnt-1했을 때, cnt가 0보다 작으면 )가 더 많다는 뜻이므로 false return
                    return false;
                }
            }
        }                                   // 위의 케이스를 다 통과한 경우 true return
        return true;
    }

    public static String split(String tmp) { //u,v로 나눈 뒤, 다시 합침
        int cnt = 0;
        String u = "";
        String v = "";
        if (tmp.length() == 0) {            //빈 문자열일 때, 빈 문자열 return
            return "";
        }
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) == '(') {     // check메서드와 마찬가지로 (일때 +, )일때 -를 cnt에 해줌
                cnt++;
            } else {
                cnt--;
            }
            if (cnt == 0) {                 // cnt가 0이란 말은 처음부터 i번째까지가 균형잡힌 문자열이란 말임
                u = tmp.substring(0, i + 1);    // 그때 u에 균형잡힌 문자열을 넣고
                v = tmp.substring(i + 1);       // 나머지를 v에 넣는다.
                if (check(u)) {          // u가 균형잡힌 문자열이고 올바른 문자열 일때,
                    u = u + split(v);    // u에 v를 재귀시켜서 다시 넣어준다.(3단계 실행)
                }else{                  // u가 균형잡힌 문자열이지만 올바른 문자열이 아닐 때,
                    String emp = "";
                    emp = "(" + emp + split(v) + ")" + reverse(u);  // 4단계를 그대로 실행
                    return emp;
                }
                //블로그에 자세한 설명 기재 - 1
                break;
            }
        }
        return u;
    }

    public static String reverse(String s) { //u 변환
        String tmp = "";
        if(s.length()==0){  //빈 문자열일 경우, 빈 문자열 반환
            return "";
        }else {             // u의 제일 처음과 끝을 제거한 후, ( -> )로, ) -> (로 바꿔준다.
            s = s.substring(1, s.length() - 1);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    tmp += ")";
                }else{
                    tmp += "(";
                }
            }
            return tmp;
        }
    }


    public String solution(String p) {  //답
        String answer = "";
        if(check(p)){                   //올바룬 문자열일 경우, 그대로 반환
            return p;
        }else{                          //올바른 문자열이 아닌 경우
            answer = split(p);          //split을 통해 문자열을 교정해준다.
        }
        return answer;
    }

    public static void main(String[] args) {    //테스트 케이스
        Solution31 test = new Solution31();
        String s = "()))((()";
        System.out.println(test.solution(s));
    }
}
