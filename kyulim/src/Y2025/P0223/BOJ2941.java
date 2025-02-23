package Y2025.P0223;

import java.io.*;

public class BOJ2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String s : croatian) {
            input = input.replace(s, "*"); // 크로아티아 알파벳을 하나의 문자로 치환
        }

        bw.write(input.length() + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
