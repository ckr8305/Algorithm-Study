package Y2025.P0202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1356 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        br.close();

        for (int i = 1; i < N.length(); i++) {
            String N1 = N.substring(0, i);
            String N2 = N.substring(i);

            int n1 = 1;
            int n2 = 1;

            for (int j = 0; j < N1.length(); j++) {
                n1 *= Character.getNumericValue(N1.charAt(j));
            }
            for (int j = 0; j < N2.length(); j++) {
                n2 *= Character.getNumericValue(N2.charAt(j));
            }

            if (n1 == n2) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
