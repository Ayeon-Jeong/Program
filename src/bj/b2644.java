package bj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b2644 {

    static int n;
    static int a, b;
    static int m;
    static int x, y;
    static boolean[][] graph;
    static boolean[] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();
        m = in.nextInt();

        graph = new boolean[n+1][n+1];
        visit = new boolean[n+1];

        for(int i = 0; i < m; i++){
            x = in.nextInt();
            y = in.nextInt();
            graph[x][y]= true;
            graph[y][x] = true;
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(a);
        visit[a] = true;
        int answer = 0;
        while(!q.isEmpty()){
            int size = q.size();

            for(int i = 0; i < size; i++){
                int now = q.poll();
                if(now == b){
                    System.out.println(answer);
                    return;
                }

                for(int j = 0; j < graph.length; j++){
                    if(graph[now][j] && !visit[j]){
                        q.add(j);
                        visit[j] = true;
                    }
                }
            }
            answer++;
        }
        System.out.println(-1);
        return;
    }
}
