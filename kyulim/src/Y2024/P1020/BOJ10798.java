package Y2024.P1020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[5];
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i >= arr[j].length()) {
                    continue;
                }
                str.append(arr[j].charAt(i));
            }
        }
        System.out.println(str);
    }
}
