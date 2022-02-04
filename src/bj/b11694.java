package bj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class node{
    int i; int j;

    public node(int i, int j){
        this.i = i;
        this.j = j;
    }
}

public class b11694 {

    static boolean[][] graph;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N, M;

    public static void bfs(node Node){
        Queue<node> q = new LinkedList<>();
        q.add(Node);

        while(!q.isEmpty()){
            node cur = q.poll();
            int curi = cur.i; int curj = cur.j;
//            visit[curi][curj] = true;

            for(int i = 0; i < 4; i++){
                int nexti = curi + dx[i];
                int nextj = curj + dy[i];
                if(nexti >= 0 && nexti < N && nextj >= 0 && nextj < M){
                    if(!visit[nexti][nextj] && graph[nexti][nextj]){
                        q.add(new node(nexti, nextj));
                        visit[nexti][nextj] = true;
                    }
                }

            }
        }


    }

    public static void main(String[] args) {
        int answer;
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while(T-- > 0){
            answer = 0;
            M = in.nextInt();
            N = in.nextInt();
            int K = in.nextInt();

            graph = new boolean[N+1][M+1];
            visit = new boolean[N+1][M+1];

            for(int i = 0; i < K; i++){
                //x, y (가로, 세로)
                int x = in.nextInt();
                int y = in.nextInt();
                graph[y][x] = true;
            }

            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    if(!visit[i][j] && graph[i][j]){
                        visit[i][j] = true;
                        bfs(new node(i, j));
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }


    }
}
