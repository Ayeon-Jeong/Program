package bj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b5014 {

    static int F, S, G, U, D;
    static boolean[] visit;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer = 0;
        F = in.nextInt();
        S = in.nextInt();
        G = in.nextInt();
        U = in.nextInt();
        D = in.nextInt();

        Queue<Integer> q = new LinkedList<>();
        visit = new boolean[F + 1];

        q.add(S);
        visit[S] = true;
        int now = 0;

        while(!q.isEmpty()){

            int size = q.size();

            for(int i = 0; i < size; i++){
                now = q.poll();

                if(now == G){
                    System.out.println(answer);
                    return;
                }

                if( now + U <= F && !visit[now + U] ){

                    q.add(now + U);
                    visit[now + U] = true;
                }
                if( now - D >= 1 && !visit[now - D] ){

                    q.add(now - D);
                    visit[now - D] = true;
                }
            }
            answer++;
        }

        System.out.println("use the stairs");

    }
}
