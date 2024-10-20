package P1020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int[] arr = new int[26];
            int max = 0;
            char ch = '?';
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                if ('a' <= str.charAt(j) && str.charAt(j) <= 'z') {
                    arr[str.charAt(j) - 97]++;
                }
            }
            max = 0;
            ch = '?';
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] > max) {
                    max = arr[k];
                    ch = (char)(k + 97);
                } else if (arr[k] == max) {
                    ch = '?';
                }
            }
            System.out.println(ch);
        }
    }
}
