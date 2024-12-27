package Y2024.P1229;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ4134 {

    // 소수 판별
    private static boolean isPrime(long num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (long i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // n 이상인 가장 작은 소수
    private static long nextPrime(long n) {
        if (n <= 2) return 2;
        if (n % 2 == 0) n++;
        while (!isPrime(n)) {
            n += 2;
        }
        return n;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            long n = Long.parseLong(br.readLine());
            bw.write(nextPrime(n) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
