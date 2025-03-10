package Y2025.P0316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1904 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[100000000];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        dp[4] = 5;


        for (int i = 5; i <= n; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 15746;
        }

        System.out.println(dp[n]);
    }
}
