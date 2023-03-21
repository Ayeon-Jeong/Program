package bj;

import java.util.*;

public class b14888 {
    public int calc(int a, int b, Character c){
        if(c == '+'){
            return a + b;
        }
        else if (c == '-'){
            return a - b;
        }
        else if (c == 'x'){
            return a * b;
        }
        else if (c == '/'){
            if( a < 0 ){
                return -((-a) / b);
            }
            else{
                return a/b;
            }
        }
        return 0;
    }
    static Map<Character, Integer> map;
    static ArrayList<Integer> list;
    static Queue<Integer> q = new LinkedList<>();

    static void dfs(int d, int value, int N){
        if(d == N){
            q.add(value);
        }
        for(Character c: map.keySet()){
            if(map.get(c) > 0){
                map.put(c, map.get(c) - 1);

                if(c == '+'){
                    dfs(d+1, value + list.get(d), N);
                }
                else if(c == '-'){
                    dfs(d+1, value - list.get(d), N);
                }
                else if(c == 'x'){
                    dfs(d+1, value * list.get(d), N);
                }
                else if(c == '/'){
                    dfs(d+1, value / list.get(d), N);
                }

                map.put(c, map.get(c) + 1);
            }


        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            list.add(in.nextInt());
        }
        map = new HashMap<>();
        map.put('+', in.nextInt());
        map.put('-', in.nextInt());
        map.put('x', in.nextInt());
        map.put('/', in.nextInt());

        dfs(1, list.get(0), N);
        System.out.println(q.stream().sorted().toArray()[q.size()-1]);
        System.out.println(q.stream().sorted().toArray()[0]);


    }
}
