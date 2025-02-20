package Y2025.P0223;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25501 {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            String s = br.readLine();
            count = 0;
            int result = isPalindrome(s);

            sb.append(result).append(" ").append(count + 1).append("\n");
        }
        System.out.println(sb);
    }

    private static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    private static int recursion(String s, int left, int right) {
        if (left >= right) return 1;
        else if (s.charAt(left) != s.charAt(right)) return 0;
        else {
            count++;
            return recursion(s, left + 1, right - 1);
        }
    }

}
