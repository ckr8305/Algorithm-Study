package P1020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] mul = new int[T];
        
        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            int r = 0;
            for (int j = 1; j <= a && j <= b; j++) {
                if (a % j == 0 && b % j == 0)
                    r = j;
            }
            int result =  (a * b) / r;
            mul[i] = result;
        }

        for (int i = 0; i < T; i++) {
            System.out.println(mul[i]);
        }
    }
}
