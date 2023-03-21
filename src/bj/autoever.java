package bj;
import java.util.*;


public class autoever {
    static int[][] map;

    static int solution1(int d, int r1, int c1, int r2, int c2){
        int sum = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i = c1; i <= c2; i++){
            q.add(map[r2][i]);
            sum += map[r2][i];
        }
        // 스왑
        for(int i = r1; i <= r2; i++){
            for(int j = c1; j <= c2; j++){
                q.add(map[i][j]);
                int n = q.poll();
                map[i][j] = n;
            }
        }
        return sum;
    }
    static int solution2(int d, int r1, int c1, int r2, int c2){
        int sum = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i = r1; i <= r2; i++){
            q.add(map[i][c2]);
            sum += map[i][c2];
        }
        // 스왑
        for(int i = c1; i <= c2; i++){
            for(int j = r1; j <= r2; j++){
                q.add(map[j][i]);
                int n = q.poll();
                map[j][i] = n;
            }
        }
        return sum;
    }
    static int solution3(int d, int r1, int c1, int r2, int c2){
        int sum = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i = r1; i <= r2; i++){
            q.add(map[i][c2]);
            sum += map[i][c2];
        }
        // 스왑
        for(int i = c1; i <= c2; i++){
            for(int j = r1; j <= r2; j++){
                q.add(map[j][i]);
                int n = q.poll();
                map[j][i] = n;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int N = 3;
        int M = 4;

        // 방향, 처음 행, 처음 열, 마지막 행, 마지막 열
        // 바뀌는 대상의 합합

        map = new int[N][M];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                map[i][j] = i * M + j + 1;
            }
        }

        System.out.println(solution2(1,0, 1, 1, 3));
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(map[i][j] + " ");

            }
            System.out.println();
        }
    }
}