package P1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3040 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        int a = 0;
        int b = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                int current = arr[i] + arr[j];
                if (sum - current == 100) {
                    a = i;
                    b = j;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            if (i == a || i == b) {
                continue;
            }
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);
    }
}
