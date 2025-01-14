package Y2025.P0119;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = N-1; j > i; j--) {
                bw.write(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < N-i; j++) {
                bw.write(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
