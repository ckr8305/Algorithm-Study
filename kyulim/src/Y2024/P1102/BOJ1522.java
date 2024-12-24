package Y2024.P1102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1522 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().trim();

        int aCount = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                aCount++;
            }
        }

        String doubleS = s + s;
        int minBCount = Integer.MAX_VALUE;
        int currentBCount = 0;

        for (int i = 0; i < aCount; i++) {
            if (doubleS.charAt(i) == 'b') {
                currentBCount++;
            }
        }
        minBCount = currentBCount;

        for (int i = 1; i < s.length(); i++) {
            if (doubleS.charAt(i - 1) == 'b') {
                currentBCount--;
            }
            if (doubleS.charAt(i + aCount - 1) == 'b') {
                currentBCount++;
            }
            minBCount = Math.min(minBCount, currentBCount);
        }

        System.out.println(minBCount);
    }
}
