package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b13460 {

    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    static class Comp{
        int x;
        int y;

        public Comp(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Comp() {
        }

        public boolean equals(Comp obj) {
            return this.x == obj.x && this.y == obj.y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    static Comp R = new Comp();
    static Comp B = new Comp();
    static Comp O = new Comp();

    public static void main(String[] args) throws IOException {
        solution();
    }

    private static void solution() throws IOException {
        int countR = -1;
        int countB = -1;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] map = new char[n][m];
        for(int i = 0; i < n; i++){
            String line = bf.readLine();
            for(int j = 0; j < m; j++){
                map[i][j] = line.charAt(j);
                if(map[i][j] == 'R'){
                    R.setX(i);
                    R.setY(j);
                }
                if(map[i][j] == 'B'){
                    B.setX(i);
                    B.setY(j);
                }
                if(map[i][j] == 'O'){
                    O.setX(i);
                    O.setY(j);
                }
            }
        }

        Queue<Comp> Rqu = new LinkedList<>();
        Queue<Comp> Bqu = new LinkedList<>();

        Rqu.add(R);
        Bqu.add(B);

        while(!Rqu.isEmpty()){
            int size = Rqu.size();
            for(int i = 0; i < size; i++){
                Comp compR = Rqu.poll();
                Comp compB = Bqu.poll();

                for(int j = 0; j < 4; j++){

                }
            }
        }


    }

}
