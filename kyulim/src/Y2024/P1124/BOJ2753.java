package Y2024.P1124;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        if (year % 400 == 0) {
            System.out.print(1);
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}
