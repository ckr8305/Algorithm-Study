package Y2025.P0223;

import java.io.*;

public class BOJ25501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            int[] count = {0};
            int result = isPalindrome(s, 0, s.length() - 1, count);
            bw.write(result + " " + count[0] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static int isPalindrome(String s, int left, int right, int[] count) {
        count[0]++;
        if (left >= right) return 1;
        if (s.charAt(left) != s.charAt(right)) return 0;
        return isPalindrome(s, left + 1, right - 1, count);
    }
}
