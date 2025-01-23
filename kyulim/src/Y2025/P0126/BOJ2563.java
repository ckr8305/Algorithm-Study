package Y2025.P0126;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;
        int totalArea = 0;
        boolean[][] result = new boolean[110][110];

        for (int i = 0; i < count; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            x = Integer.parseInt(stringTokenizer.nextToken());
            y = Integer.parseInt(stringTokenizer.nextToken());
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!result[j][k]) {
                        result[j][k] = true;
                        totalArea++;
                    }
                }
            }
        }

        bw.write(String.valueOf(totalArea));

        br.close();
        bw.flush();
        bw.close();
    }
}