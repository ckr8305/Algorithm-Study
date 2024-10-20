package P1020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        int max = 0;
        int ii = 0;
        int jj = 0;

        for (int i = 0; i < arr.length; i++) {
            String[] str = br.readLine().split(" ");

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
                if (max <= arr[i][j]) {
                    max = arr[i][j];
                    ii = i+1;
                    jj = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(ii + " " + jj);
    }
}
