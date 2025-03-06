package Y2025.P0309;

import java.io.*;
import java.util.*;

public class BOJ14889 {
    static int N;
    static int[][] S;
    static boolean[] visited;
    static int minDiff = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        S = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                S[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        backtracking(0, 0);

        // 최소 능력치 차이 출력
        System.out.println(minDiff);
    }

    static void backtracking(int index, int count) {
        if (count == N / 2) {
            calculateTeamDifference();
            return;
        }

        for (int i = index; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                backtracking(i + 1, count + 1);
                visited[i] = false;
            }
        }
    }

    static void calculateTeamDifference() {
        int startSum = 0, linkSum = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i] && visited[j]) {
                    startSum += S[i][j];
                } else if (!visited[i] && !visited[j]) {
                    linkSum += S[i][j];
                }
            }
        }

        int diff = Math.abs(startSum - linkSum);
        minDiff = Math.min(minDiff, diff);
    }
}
