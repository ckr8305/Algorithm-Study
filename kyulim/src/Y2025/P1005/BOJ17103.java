package Y2025.P1005;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ17103 {
    static boolean[] primeArray = new boolean[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        findPrime();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            bw.write(countPartitions(N) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    static void findPrime() {
        primeArray[0] = primeArray[1] = true;

        for (int i = 2; i * i < primeArray.length; i++) {
            if (!primeArray[i]) {
                for (int j = i * i; j < primeArray.length; j += i) {
                    primeArray[j] = true;
                }
            }
        }
    }

    static int countPartitions(int N) {
        if (N % 2 != 0 || N < 4) return 0;

        int count = 0;
        for (int j = 2; j <= N / 2; j++) {
            if (!primeArray[j] && !primeArray[N - j]) {
                count++;
            }
        }
        return count;
    }
}
