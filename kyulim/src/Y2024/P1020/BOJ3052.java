package Y2024.P1020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>(10);

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {

            int result = Integer.parseInt(br.readLine());
            arr[i] = result % 42;

            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}
