package Y2025.P0316;

import java.io.*;

public class BOJ1904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            bw.write("1\n");
        } else if (N == 2) {
            bw.write("2\n");
        } else {
            int[] dp = new int[N + 1];
            dp[1] = 1;
            dp[2] = 2;

            for (int i = 3; i <= N; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
            }

            bw.write(dp[N] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
