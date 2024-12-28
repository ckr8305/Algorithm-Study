package Y2024.P1027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        long n = Long.parseLong(str[0]);
        long m = Long.parseLong(str[1]);

        long result = n - m;
        System.out.println(Math.abs(result));
    }
}
