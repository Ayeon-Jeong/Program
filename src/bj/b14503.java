package bj;

import HashMap.Sol;
import HashMap.Solution;

import java.util.Scanner;

public class b14503 {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    static int N, M;
    static boolean[][] visit;
    static int[][] map;
    static int answer = 0;

    public static void Solution(int r, int c, int d){

        visit[r][c] = true;
        for(int i = 0; i < 4; i++){
            int dd = d-1;
            if(dd < 0) dd += 4;

            int nr = r + dy[i];
            int nc = c + dx[i];

            if(nr >= 0 && nc >= 00 && nr < N && nc < M){
                if(!visit[nr][nc] && map[nr][nc] == 0){
                    answer++;
                    Solution(nr, nc, dd);
                    return;
                }
            }
        }

        int dd = (d + 2) % 4; // 반대방향
        int nr = r + dy[dd];
        int nc = c + dx[dd];

        if(nr >= 0 && nc >= 00 && nr < N && nc < M && map[nr][nc] == 0){
            Solution(nr, nc, dd);
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt(); M = in.nextInt();

        visit = new boolean[N][M];
        map = new int[N][M];

        int r, c, d;
        r = in.nextInt(); c = in.nextInt(); d = in.nextInt();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                map[i][j] = in.nextInt();
                visit[i][j] = false;
            }
        }

        new b14503().Solution(r, c, d);

        System.out.println(answer + 1);
    }
}
