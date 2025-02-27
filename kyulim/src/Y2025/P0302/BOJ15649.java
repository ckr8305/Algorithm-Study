package Y2025.P0302;

import java.io.*;
import java.util.*;

public class BOJ15649 {
    static int N, M;
    static boolean[] visited;
    static int[] result;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        result = new int[M];

        backtrack(0);

        br.close();
        bw.flush();
        bw.close();
    }

    static void backtrack(int depth) throws IOException {
        if (depth == M) {
            for (int num : result) {
                bw.write(num + " ");
            }
            bw.newLine();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = i;
                backtrack(depth + 1);
                visited[i] = false;
            }
        }
    }
}
