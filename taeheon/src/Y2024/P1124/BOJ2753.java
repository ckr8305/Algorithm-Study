package Y2024.P1124;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2753 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
