package Y2025.P0105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ17103 {
    static final int SIZE = 1_000_000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        boolean[] prime = new boolean[SIZE + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        isPrime(prime);

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int count = 0;
            int n = Integer.parseInt(br.readLine());

            for (int i = 2; i <= n / 2; i++) {
                if (prime[i] && prime[n - i]) count++;
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }

    static void isPrime(boolean[] prime) {
        for (int i = 2; i <= Math.sqrt(SIZE); i++) {
            if (prime[i]) {
                for (int j = i * i; j <= SIZE; j += i) {
                    prime[j] = false;
                }
            }
        }
    }
}
