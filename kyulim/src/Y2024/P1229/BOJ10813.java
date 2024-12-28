package Y2024.P1229;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }

        for (int k = 0; k < M; k++) {
            String[] strArr = br.readLine().split(" ");
            int i = Integer.parseInt(strArr[0]) - 1;
            int j = Integer.parseInt(strArr[1]) - 1;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < N; i++) {
            bw.write(arr[i] + " ");
        }

        br.close();
        bw.close();
    }
}
