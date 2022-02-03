package bj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class b1697 {

    static int answer;

    public void bfs(int a, int b){
        answer = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(a);

        while(!q.isEmpty()){

//            System.out.println("answer: " + answer);
            int size = q.size();
            for(int i = 0; i < size; i++) {
                int now = q.poll();
//                System.out.println(now);
                if (now == b)
                    return;
                else{
                    q.add(now - 1);
                    q.add(now + 1);
                    q.add(2 * now);
                }

            }
            answer++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        new b1697().bfs(in.nextInt(), in.nextInt());
        System.out.println(answer);
    }
}
