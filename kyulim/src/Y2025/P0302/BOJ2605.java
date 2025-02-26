package Y2025.P0302;

import java.io.*;
import java.util.*;

public class BOJ2605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> lineup = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());
            lineup.add(lineup.size() - num, i);
        }

        for (int student : lineup) {
            bw.write(student + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}