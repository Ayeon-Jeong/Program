package Programmers;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Network {
    static boolean visit[][] = new boolean[201][201];

    public void bfs(int a, int b, int N, int[][] computers){
        System.out.println(a + " " + b);
        System.out.println("?");
        visit[a][b] = true; visit[a][a] = true;
        visit[b][a] = true; visit[b][b] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(b);

        while(!q.isEmpty()){
            int target = q.poll();
            System.out.println("target: " + target);
            for(int i = 0; i < N; i++){
                if(!visit[target][i] && computers[target][i] == 1){
                    visit[target][i] = true;
                    q.add(i);
                }
            }
        }
        return;
    }

    public int solution(int n, int[][] computers) {
        int answer = 0;

        for(int i = 0; i < computers.length; i++){
            for(int j = 0; j < computers.length; j++){
                if(!visit[i][j] && computers[i][j] == 1){
//                    System.out.println(i + " " + j);
                    bfs(i, j, computers.length, computers);
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

        System.out.println(new Network().solution(3, computers));
    }
}
