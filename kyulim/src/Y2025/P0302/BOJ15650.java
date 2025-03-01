package Y2025.P0302;

import java.io.*;

public class BOJ15650 {
    static BufferedWriter bw;
    static int N, M;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        arr = new int[M];

        backtrack(1, 0);

        br.close();
        bw.flush();
        bw.close();
    }

    static void backtrack(int start, int depth) throws IOException {
        if (depth == M) {
            for (int num : arr) {
                bw.write(num + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = start; i <= N; i++) {
            arr[depth] = i;
            backtrack(i + 1, depth + 1);
        }
    }
}
