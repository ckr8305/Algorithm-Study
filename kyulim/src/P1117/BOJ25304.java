package P1117;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25304 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[2];
        int result = 0;

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            arr[0] = Integer.parseInt(str[0]);
            arr[1] = Integer.parseInt(str[1]);

            result += arr[0] * arr[1];
        }
        if (result == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
