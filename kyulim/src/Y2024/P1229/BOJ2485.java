package Y2024.P1229;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int gcd = 0;

        for (int i = 0; i < N - 1; i++) {
            int a = arr[i + 1] - arr[i];
            gcd = findGCD(a, gcd);
        }
        bw.write((arr[N - 1] - arr[0]) / gcd + 1 - (arr.length) + " ");

        br.close();
        bw.flush();
        bw.close();
    }
    static int findGCD(int A, int B){
        while(B != 0){
            int R = A%B;
            A = B;
            B = R;
        }
        return A;
    }
}
