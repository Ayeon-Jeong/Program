package bj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b2798 {

    public int F(List<Integer> list,  int M){
        int max = 0;

        for(int i = 0; i < list.size() - 2; i++){
            for(int j = i + 1 ; j < list.size() - 1; j++){
                for(int k = j + 1; k < list.size(); k ++){
                    int tmp = list.get(i) + list.get(j) + list.get(k);
                    if(max < tmp && tmp <= M)
                        max = tmp;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int N, M;
        Scanner in = new Scanner(System.in);

        N = in.nextInt(); M = in.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            int a = in.nextInt();
            list.add(a);
        }

        System.out.println(new b2798().F(list, M));
    }
}
