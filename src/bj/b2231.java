package bj;

import java.util.Map;
import java.util.Scanner;

public class b2231 {

    public int F(int N){
        int answer = N;
        while(N > 0){

            answer += N % 10;
            N /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int i = 1; i < N; i++){
            int a = new b2231().F(i);
            if(a == N){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
