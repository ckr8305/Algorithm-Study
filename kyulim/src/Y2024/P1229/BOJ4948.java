package Y2024.P1229;

import java.io.*;

public class BOJ4948 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 123456 * 2;
        boolean[] isPrime = new boolean[max + 1];
        sieveOfEratosthenes(isPrime, max);

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;

            int count = countPrimes(isPrime, N + 1, 2 * N);
            bw.write(count + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    // 에라토스테네스의 체로 소수 판별 배열 생성
    static void sieveOfEratosthenes(boolean[] isPrime, int max) {
        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    // 소수 개수 세기
    static int countPrimes(boolean[] isPrime, int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }
}
