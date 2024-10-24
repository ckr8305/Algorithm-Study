package P1027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] arr = new int[5];
        int mul = 0;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
            mul = (int)(Math.pow(arr[i], 2));
            result += mul;
        }
        System.out.println(result % 10);
    }
}
