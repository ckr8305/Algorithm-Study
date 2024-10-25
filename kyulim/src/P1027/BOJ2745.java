package P1027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        String input = str[0];
        int B = Integer.parseInt(str[1]);

        int result = Integer.parseInt(input, B);

        System.out.println(result);
    }
}
