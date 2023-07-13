class Solution{
public int[] solution(String[] park, String[] routes) {
    int[] cur = {};  // [h, w]
    final int wSize = park[0].length(); // 0~n
    final int hSize = park.length; // 0~n
    boolean[][] map = new boolean[hSize][wSize];
    
    // 현재위치 조정
    for (int i = 0; i < hSize; i++) {
        int j = 0;
        for (String ch : park[i].split("")) {
            if (ch.equals("S")) {
                map[i][j] = true;
                cur = new int[]{i, j};
            }
            if (ch.equals("O")) {
                map[i][j] = true;
            }
            if (ch.equals("X")) {
                map[i][j] = false;
            }
            j++;
        }
    }
    
    for (String r : routes) {
        int go = Integer.parseInt(r.split("")[2]); // 몇칸
        boolean pass = true;
        if (r.startsWith("E") && (cur[1] + go < wSize)) {
            for (int cnt = 1; cnt <= go; cnt++) {
                pass = map[cur[0]][cur[1] + cnt];
                if (!pass) {
                    break;
                }
            }
            if (pass) {
                cur[1] += go;
            }
        }
        if (r.startsWith("W") && (0 <= cur[1] - go)) {
            for (int cnt = 1; cnt <= go; cnt++) {
                pass = map[cur[0]][cur[1] - cnt];
                if (!pass) {
                    break;
                }
            }
            if (pass) {
                cur[1] -= go;
            }
        }
        if (r.startsWith("S") && (cur[0] + go < hSize)) {
            for (int cnt = 1; cnt <= go; cnt++) {
                pass = map[cur[0] + cnt][cur[1]];
                if (!pass) {
                    break;
                }
            }
            if (pass) {
                cur[0] += go;
            }
        }
        if (r.startsWith("N") && (0 <= cur[0] - go)) {
            for (int cnt = 1; cnt <= go; cnt++) {
                pass = map[cur[0] - cnt][cur[1]];
                if (!pass) {
                    break;
                }
            }
            if (pass) {
                cur[0] -= go;
            }
        }
    }
    return cur;
}
}
