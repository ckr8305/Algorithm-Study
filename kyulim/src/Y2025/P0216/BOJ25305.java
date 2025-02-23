package Y2025.P0216;

import java.io.*;
import java.util.*;

public class BOJ25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Integer[] scores = new Integer[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(scores, Collections.reverseOrder());

        bw.write(scores[k - 1] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
