package Y2024.P1020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        long a = Integer.parseInt(str[0]);
        long b = Integer.parseInt(str[1]);

        long r = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                r = i;
        }
        System.out.println((a * b) / r);
    }
}
