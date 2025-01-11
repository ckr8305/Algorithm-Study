package Y2025.P0112;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2675 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            int R = Integer.parseInt(str[0]);
            String s = str[1];
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < R; k++) {
                    bw.write(s.charAt(j));
                }
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
