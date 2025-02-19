package Y2025.P0216;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        long result = factorial(N);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}

