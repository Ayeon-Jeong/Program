package bj;

import java.util.Scanner;

public class b2579 {
    static int n;
    static int[] step;

    static int max(int a, int b){
        return a >= b ? a : b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        step = new int[n+1];
        for(int i = 0; i < n; i++){
            step[i] = in.nextInt();
        }

        int[][] dp = new int[n+1][3];
        dp[0][0] = 0; dp[0][1] = step[0]; dp[0][0] = 0;
        dp[1][0] = step[0]; dp[1][1] = step[0] + step[1]; dp[1][2] = step[1];


        for(int i = 2; i < n; i++){
            // 전 계단에서 두계단 올라가고 싶을 때
            dp[i][0] = max(dp[i-1][1], dp[i-1][2]);
            // 전계단을 밞고 이 계단 밟을 때
            dp[i][1] = dp[i-1][2] + step[i];
            // 두계단 전에서 이 계단으로 점프했을 때
            // 전계단을 안밟음.
            dp[i][2] = dp[i-1][0] + step[i];
        }
        System.out.println(max(dp[n-1][1], dp[n-1][2]));
    }

}
