package Y2024.P1229;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2485 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int diff = arr[1] - arr[0];
        int gcd = diff;

        for (int i = 1; i < n - 1; i++) {
            diff = arr[i + 1] - arr[i];
            gcd = gcd(gcd, diff);
        }

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            while (arr[i] + gcd != arr[i + 1]) {
                arr[i] += gcd;
                count++;
            }
        }

        System.out.println(count);
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
