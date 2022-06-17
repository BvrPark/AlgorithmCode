package Programmers.Level2;

public class Solution43 {           //피로도 문제
    public static int answer;
    public static boolean[] visit;  // 방문한 곳을 기록할 배열 생성, 특별한 설정 없으면 기본값은 false

    public static void dfs(int cnt, int[][] dungeons, int k) {
        for (int i = 0; i < visit.length; i++) {                    //visit의 길이만큼 반복
            if (!visit[i] && k >= dungeons[i][0]) {                 //visit[i]가 false고, k가 최소필요피로도보다 크거나 같으면
                visit[i] = true;                                    //visit[i]를 true(던전을 돌았다)로 바꾸고
                dfs(cnt + 1, dungeons, k - dungeons[i][1]);  //cnt(count)를 1개 증가시키고 k에서 소모피로도 만큼을 뺀 것을 k로 다시 지정해서 재귀
                visit[i] = false;                                   //dfs에서 다 검사를 했을 것이므로 visit[i]를 다시 안 간것으로 바꿈
            }
        }
        answer = Math.max(answer, cnt);                             //다 돌았을 때, 최대값을 answer에 저장
    }

    public static int solution(int k, int[][] dungeons) {
        answer = 0;
        visit = new boolean[dungeons.length];                       //visit배열을 던전배열의 길이만큼 생성
        dfs(0, dungeons, k);
        return answer;
    }
}
