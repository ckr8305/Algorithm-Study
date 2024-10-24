package P1027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            for (int j = i+1; j < count; j++)
                System.out.print(" ");
            for (int k = 0; k < i*2+1 ; k++)
                    System.out.print("*");

            System.out.println();
        }
    }
}
