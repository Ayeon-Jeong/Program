package bj;
import java.util.*;

class Edge implements Comparable<Edge> {
    int start;
    int end;
    int value;

    public Edge(int start, int end, int value){
        this.start = start;
        this.end = end;
        this.value = value;
    }

    @Override
    public int compareTo(Edge o){
        return o.value >= this.value ? -1 : 1;
    }
}

public class b1197 {
    static int V, E;
    static PriorityQueue<Edge> pq = new PriorityQueue<>();
    static int[] parent;

    // 상위 노드 초기화
    public static void initParent(){
        parent = new int[V+1];
        for(int i = 1; i <= V; i++){
            parent[i] = i;
        }
    }

    // find
    public static int find(int a){
        if (a == parent[a]){
            return a;
        }
        return parent[a] = find(parent[a]);
    }

    // Union
    public static void union(int a, int b){
        int aP = find(a);
        int bP = find(b);
        if(aP != bP){
            parent[aP] = bP;
        }
        else {
            return;
        }
    }

    public static int Kruscal(){

        int ret = 0;
        int cnt = 0;

        while(!pq.isEmpty()){
            // 우선순위 큐니까 가중치 젤 작은게 앞으로 온다
            Edge tmp = pq.poll();

            int a = find(tmp.start);
            int b = find(tmp.end);

            if(a == b){
                continue;
            }

            union(a, b);
            ret += tmp.value;
            if(++cnt == V){
                break;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        V = in.nextInt(); E = in.nextInt();
        ArrayList<Edge> list = new ArrayList<>();
        initParent();
        for(int i = 0; i < E; i++){
            int start = in.nextInt();
            int end = in.nextInt();
            int value = in.nextInt();

            pq.add(new Edge(start, end, value));
        }

        System.out.println(Kruscal());

    }

}
