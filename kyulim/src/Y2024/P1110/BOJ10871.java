package Y2024.P1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10871 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int X = Integer.parseInt(str[1]);

        str = br.readLine().split(" ");
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str[i]);
            if (arr[i] >= X)
                arr[i] = 0;
        }

        for (int i = 0; i < N; i++) {
            if (arr[i] != 0)
                System.out.print(arr[i] + " ");
        }
    }
}
