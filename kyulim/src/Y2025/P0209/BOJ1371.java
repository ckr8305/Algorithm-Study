package Y2025.P0209;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1371 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String str;

        while ((str = br.readLine()) != null) {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    arr[ch - 'a']++;
                }
            }
        }
        br.close();

        int max = 0;
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] == max) {
                System.out.print((char) ('a' + i));
            }
        }
        System.out.println();
    }
}
