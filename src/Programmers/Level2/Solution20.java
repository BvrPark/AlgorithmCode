package Programmers.Level2;

public class Solution20 {           //방문 길이
    static boolean[][][][] map = new boolean[11][11][11][11];   //경로를 지나갔는지 판별할 배열 설정
    static int cx = 5, cy = 5;                                  //현재의 x,y좌표
    static int nx = 5, ny = 5;                                  //다음에 이동할 x,y좌표
    public int solution(String dirs) {
        int answer = 0;                                         //경로의 수
        for(char x : dirs.toCharArray()){
            cx = nx;                                            //현재의 x,y좌표에 다음에 이동할 x,y좌표를 넣는다.
            cy = ny;
            if(x == 'U'){                                       //들어온 문자에 따라서 x,y좌표를 다르게 이동한다.
                ny += 1;
            }else if(x == 'D'){
                ny -= 1;
            }else if(x == 'R'){
                nx += 1;
            }else{
                nx -= 1;
            }
            if(nx > 10 || nx < 0 || ny > 10 || ny < 0){         //다음에 이동할 x,y좌표가 주어진 좌표를 넘을 시
                nx = cx;                                        //다시 좌표를 그 전 좌표로 바꾼다.
                ny = cy;
            }else{                                              //주어진 좌표값을 넘어가지 않을 시,
                if(!map[cx][cy][nx][ny]){                       //만약 경로가 처음가는 경로이면
                    map[cx][cy][nx][ny] = true;                 //왕복경로를 모두 true로 바꾸고 경로의 수에 +1을 해준다.
                    map[nx][ny][cx][cy] = true;
                    answer++;
                }
            }
        }

        return answer;
    }
}
