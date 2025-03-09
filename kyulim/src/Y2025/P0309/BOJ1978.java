package Y2025.P0309;

import java.io.*;
import java.util.Arrays;

public class BOJ1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int limit = 0;
        for (int num : arr) {
            limit = Math.max(limit, num);
        }
        boolean[] isPrime = sieveOfEratosthenes(limit);

        int count = 0;
        for (int num : arr) {
            if (isPrime[num]) {
                count++;
            }
        }

        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static boolean[] sieveOfEratosthenes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}
