package Y2025.P0126;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11653 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        isPrime(prime, n);

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                while (n % i == 0) {
                    sb.append(i).append("\n");
                    n /= i;
                }
            }
        }

        System.out.println(sb);
    }

    private static void isPrime(boolean[] prime, int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
    }
}
