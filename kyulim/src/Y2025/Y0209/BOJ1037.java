package Y2025.Y0209;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];
        String[] str = br.readLine().split(" ");

        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(arr);
        int result = arr[0] * arr[arr.length-1];

        System.out.println(result);
    }
}
