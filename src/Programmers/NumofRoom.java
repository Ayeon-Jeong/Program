package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class NumofRoom {

    static class Pair{
        public int x;
        public int y;

        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode(){
            return Objects.hash();
        }

        @Override
        public boolean equals(Object o){
            return this.x == ((Pair) o).x && this.y == ((Pair) o).y;
        }

        public int solution(int[] arrows) {
            int cnt = 0;

            Pair pointHC = new Pair(0, 0);
            int[] dx = { 0, 1, 1, 1, 0, -1, -1, -1 };
            int[] dy = { 1, 1, 0, -1, -1, -1, 0, 1 };

            // 방문 여부 관련 선언
            // key = 시작 노드의 hashcode, value = 연결된 node 들의 hashcode

            HashMap<Pair, ArrayList<Pair>> visit = new HashMap<>();

            for(int arrow : arrows){
                for(int i = 0; i <= 1; i++){
                    Pair newPointHC = new Pair(pointHC.x + dx[arrow], pointHC.y + dy[arrow]);

                    if(!visit.containsKey(newPointHC)){
                        visit.put(newPointHC, makeEdgeList(pointHC));

                        if(visit.get(pointHC) == null){
                            visit.put(pointHC, makeEdgeList(newPointHC));
                        } else{
                            visit.get(pointHC).add(newPointHC);
                        }
                    }
                    else if (visit.containsKey(newPointHC) && !(visit.get(newPointHC).contains(pointHC))){
                        visit.get(newPointHC).add(pointHC);
                        visit.get(pointHC).add(newPointHC);
                        cnt++;
                    }

                    pointHC = newPointHC;
                }
            }
            return cnt;
        }

        public static ArrayList<Pair> makeEdgeList(Pair pointHC){
            ArrayList<Pair> edge = new ArrayList<>();
            edge.add(pointHC);
            return edge;
        }
    }



}
