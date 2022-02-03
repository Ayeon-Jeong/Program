package bj;
import java.util.*;
import java.math.*;
import java.lang.Math;

public class b18222 {

    static int[] dp;

    public double find(int k){
        int answer = 0;

        while(k > 0){
            k /= 2;
            answer++;
        }

        return answer;
    }

    public int solution(int k){
        if(k == 1)
            return 0;
        else{
            if(k % 2 == 0){
                int tmp = solution(k/2);
                return 1 - tmp;
            }
            else{
                double n = find(k) - 1;
                int tmp = solution(k - (int) Math.pow(2, n));
                return 1 - tmp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int k = in.nextInt();
        int k = 3;
//        int count = new b18222().find(k);
//        ArrayList<Integer> list = new ArrayList<>();
        int a = new b18222().solution(k);
        System.out.println(a);


    }

}
