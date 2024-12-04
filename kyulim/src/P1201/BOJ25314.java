package P1201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25314 {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while (N > 0) {
            System.out.print("long ");
            N -= 4;
        }
        System.out.print("int");
    }
}
