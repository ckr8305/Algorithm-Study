package Y2025.P0309;

import java.io.*;
import java.util.*;

public class BOJ15652 {
    static int N, M;
    static int[] sequence;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        sequence = new int[M];

        backtracking(1, 0);

        bw.flush();
        bw.close();
        br.close();
    }

    static void backtracking(int start, int depth) throws IOException {
        if (depth == M) {
            for (int num : sequence) {
                bw.write(num + " ");
            }
            bw.newLine();
            return;
        }

        for (int i = start; i <= N; i++) {
            sequence[depth] = i;
            backtracking(i, depth + 1);
        }
    }
}
