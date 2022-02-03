package Programmers;

//import HashMap.Solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class travel {
    public String src;
    public String dst;
    static boolean[] visit;

    public travel(){
    }

    public ArrayList<String> dfs(String src, int index, ArrayList<String> answer, String[][] tickets) {
//        visit[index] = true;
        answer.add(src);
        System.out.println(answer);
        for(int i = 0; i < tickets.length; i++){
            if(src.equals(tickets[i][0]) && !visit[i]){
                visit[i] = true;
                dfs(tickets[i][1], i, answer, tickets);
                visit[i] = false;

            }
        }

        return answer;
    }


    public String[] solution(String[][] tickets) {
        String[] answer = {};
        visit = new boolean[tickets.length];

        ArrayList<String> result = dfs("ICN", 0, new ArrayList<String>(), tickets);
        return answer;
    }

    public static void main(String[] args) {

        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
        System.out.println(new travel().solution(tickets));
        }
    }

