package P1208;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11650 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int arr[][];
        int N = Integer.parseInt(br.readLine());
        arr = new int [N][2];

        for(int i=0; i<N; i++) {
            String[] st = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(st[0]);
            arr[i][1] = Integer.parseInt(st[1]);
        }

        Arrays.sort(arr, (arr_1, arr_2) -> {

            if(arr_1[0] == arr_2[0])  {
                return arr_1[1] - arr_2[1];
            }
            else {
                return arr_1[0] - arr_2[0];
            }
        });

        for(int i=0; i<N; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }

        System.out.println(sb);
    }
}
