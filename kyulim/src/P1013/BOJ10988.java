package P1013;

import java.io.*;

public class BOJ10988 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int ans = 1;

        // 마지막 문자부터 첫 번째 문자까지 역순으로 반복하며 c에 저장
        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);

            // 앞 문자부터 같은지 비교하고 다르면 ans = 0
            if (c != input.charAt(input.length() - i - 1)) {
                ans = 0;
                break;
            }
        }

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
