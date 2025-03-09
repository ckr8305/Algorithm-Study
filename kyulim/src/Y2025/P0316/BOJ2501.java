package Y2025.P0316;

import java.io.*;

public class BOJ2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
                if (count == K) {
                    bw.write(i + "\n");
                    bw.flush();
                    br.close();
                    bw.close();
                    return;
                }
            }
        }

        bw.write("0\n");
        bw.flush();

        br.close();
        bw.close();
    }
}
