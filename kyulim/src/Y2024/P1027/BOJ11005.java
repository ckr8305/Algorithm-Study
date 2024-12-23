package Y2024.P1027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);

        String result = Integer.toString(N, B).toUpperCase();
        System.out.println(result);
    }
}
