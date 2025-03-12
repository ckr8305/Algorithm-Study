package Y2025.P0316;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0) break;

            if (B % A == 0) {
                bw.write("factor\n");
            } else if (A % B == 0) {
                bw.write("multiple\n");
            } else {
                bw.write("neither\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
