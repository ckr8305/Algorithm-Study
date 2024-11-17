package P1117;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2748 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long f0 = 0;
        long f1 = 1;
        long temp = 1;

        for (int i = 2; i <= n; i++) {
            temp = f1;
            f1 += f0;
            f0 = temp;
        }
        System.out.println(f1);
    }
}
