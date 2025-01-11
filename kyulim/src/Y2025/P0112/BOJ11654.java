package Y2025.P0112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11654 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char str = br.readLine().charAt(0);
        System.out.println((int)str);

        br.close();
    }
}
