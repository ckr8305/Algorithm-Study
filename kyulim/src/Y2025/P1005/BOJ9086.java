package Y2025.P1005;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ9086 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            bw.write(firstChar + "" + lastChar + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
