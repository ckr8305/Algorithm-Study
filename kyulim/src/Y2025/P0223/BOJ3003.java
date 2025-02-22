package Y2025.P0223;

import java.io.*;
import java.util.*;

public class BOJ3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] correct = {1, 1, 2, 2, 2, 8};
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 6; i++) {
            int current = Integer.parseInt(st.nextToken());
            bw.write((correct[i] - current) + " ");
        }

        bw.write("\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
