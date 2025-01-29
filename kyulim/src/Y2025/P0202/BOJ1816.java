package Y2025.P0202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] s = new long[N];

        for (int i = 0; i < N; i++) {
            s[i] = Long.parseLong(br.readLine());
        }

        double max = Math.pow(10, 6);

        for (int i = 0; i < N; i++) {
            long num = s[i];
            String result = "YES";
            for (long j = 2L; j <= max; j++) {
                if (num % j == 0) {
                    result = "NO";
                    break;
                }
            }
            System.out.println(result);
        }
        br.close();
    }
}
