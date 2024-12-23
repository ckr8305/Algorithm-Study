package Y2024.P1020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[42];
        int result = 0;

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n % 42]++;
        }

        for (int i : arr) {
            if (i > 0) result++;
        }

        System.out.println(result);
    }
}
