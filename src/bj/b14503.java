package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b14503 {

    // 북 동 남 서
    // 탐색할 위치: r + dx[d], c + dy[d]
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static class Coor{
        int r;
        int c;
        int d;

        public Coor(int r, int c, int d) {
            this.r = r;
            this.c = c;
            this.d = d;
        }

        public int getR() {
            return r;
        }

        public void setR(int r) {
            this.r = r;
        }

        public int getC() {
            return c;
        }

        public void setC(int c) {
            this.c = c;
        }

        public int getD() {
            return d;
        }

        public void setD(int d) {
            this.d = d;
        }
    }

    public static void main(String[] args) throws IOException {
        solution(0);
    }

    private static void solution(int answer) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(bf.readLine());
            for(int j = 0; j < m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Coor robot = new Coor(r, c, d);
        boolean flag = true;
        while(flag){
            int nowr = robot.getR();
            int nowc = robot.getC();
            int nowd = robot.getD();
            // 1. 현재 칸이 아직 청소되지 않은 경우, 현재 칸을 청소한다.
            if(map[nowr][nowc] == 0){
                map[nowr][nowc] = -1;
                answer++;
            }

            boolean exist = false;
            // 현재 칸의 주변 4칸 중
            for(int i = 0; i < 4; i++){
                // 주변 네칸 탐색
                int nx = nowr + dx[i];
                int ny = nowc + dy[i];

                // 범위를 벗어나면 pass
                if(nx >= n || nx < 0 || ny >= m || ny < 0)
                    continue;
                // 청소되지 않은 빈칸이 있으면
                else if(map[nx][ny] == 0){
                    // 반시계 방향으로 90도 회전
                    exist = true;
                    robot.setD((nowd + 3) % 4);
                    nowd = robot.getD();
                    // 회전 후 앞 칸이 청소되지 않은 빈 칸이면 전진한다
                    if(map[nowr + dx[nowd]][nowc + dy[nowd]] == 0){
                        robot.setR(nowr + dx[nowd]);
                        robot.setC(nowc + dy[nowd]);
                    }
                    break;
                }

                if(i == 3 && !exist){
                    // 청소되지 않은 빈칸이 없으면
                    // 바라보는 방향의 반대방향 = (d + 2) % 4
                    if(map[nowr + dx[(nowd + 2) % 4]][nowc + dy[(nowd + 2) % 4]] == 1){
                        flag = false;
                    } else{
                        robot.setR(nowr + dx[(nowd + 2) % 4]);
                        robot.setC(nowc + dy[(nowd + 2) % 4]);
                    }
                }
            }


        }
        System.out.println(answer);

    }
}
