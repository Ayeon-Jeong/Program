package bj;

import java.util.Scanner;

public class b2206 {

    static boolean[][] map;
    static boolean[][] visit;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int min = 9999;
    static int N, M;
    static class Node{
        boolean flag;
        int n, m;
        int dist;

        public Node(int n, int m, boolean flag, int dist){
            this.n = n;
            this.m = m;
            this.flag = flag;
            this.dist = dist;

        }

    }

    static void dfs(Node node){
        // 지금 내가 이동한 위치가 N, M 인지 확인
        System.out.println("현재 위치: " + node.n + " " + node.m);
        if(node.n == N && node.m == M){
//            System.out.println(cnt);
            return;
        }


        for(int i = 0; i < 4; i++){


        }
        return;



    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        N = in.nextInt();
        M = in.nextInt();

        map = new boolean[N+1][M+1];
        visit = new boolean[N+1][M+1];
        for(int i = 1; i <= N; i++){
//            for(int j = 1; j <= M; j++){
                String tmp = in.next();
                for(int k = 0; k < M ; k++){
                    if(tmp.charAt(k) == '1'){
                        map[i][k+1] = true;
                    }
                    else{
                        map[i][k+1] = false;
                    }
                }
//            }
        }
        visit[1][1] = true;
        dfs(new Node(1, 1, false, 0));


    }
}
