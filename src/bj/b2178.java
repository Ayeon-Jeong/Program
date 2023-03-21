package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pair{
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class b2178 {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        solution();
    }

    private static void solution() throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 시작점으로부터 거리를 계산한 배열
        int[][] dist = new int[a][b];
        char[][] miro = new char[a][b];

        for(int i=0; i<a; i++){
            String line = bf.readLine();
            for(int j=0; j<b; j++){
                miro[i][j] = line.charAt(j);
                dist[i][j] = -1;    // 거리를 -1로 세팅하면, 방문여부를 확인가능.
            }
        }

        // bfs 위한 QUEUE
        Queue q = new LinkedList<Pair>();
        q.add(new Pair(0, 0));
        dist[0][0] = 1;

        while(!q.isEmpty()){
            Pair p = (Pair) q.poll();

            for(int i = 0; i < 4; i++){
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                // 범위 벗어나면 pass
                if(nx < 0 || nx >= a || ny < 0 || ny >= b){
                    continue;
                }

                // 길이 아니거나, 방문 했으면 pass
                if(miro[nx][ny] == '0' || dist[nx][ny] != -1){
                    continue;
                }

                dist[nx][ny] = dist[p.x][p.y] + 1;
                q.add(new Pair(nx, ny));

            }
        }

        System.out.println(dist[a-1][b-1]);

    }
}
