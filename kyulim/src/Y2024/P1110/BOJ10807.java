package Y2024.P1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10807 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] str = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str[i]);
            if (arr[i] == v)
                count++;
        }
        System.out.println(count);
    }

}
