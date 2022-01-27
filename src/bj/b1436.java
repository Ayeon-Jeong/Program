package bj;

import java.util.Collection;
import java.util.Scanner;

public class b1436 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();


//        boolean contains = s.contains("666");
//        System.out.println(contains);

        int cnt = 0;
        for(int i=666; ; i++){
            String s = Integer.toString(i);
            if(s.contains("666")){
                cnt++;
            }
            if(cnt == N){
                System.out.println(i);
                return;
            }
        }

    }
}
