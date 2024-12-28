package Y2024.P1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3040 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int result = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            result += arr[i];
        }

        outLoop:
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (result - arr[i] - arr[j] == 100) {
                    arr[i] = arr[j] = 0;
                    break outLoop;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
