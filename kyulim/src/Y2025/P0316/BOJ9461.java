package Y2025.P0316;

import java.io.*;

public class BOJ9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        long[] dp = new long[101];

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;

        for (int i = 4; i <= 100; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            bw.write(dp[N] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
