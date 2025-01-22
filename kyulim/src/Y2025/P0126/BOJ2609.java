package Y2025.P0126;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);

        int gcd = getGCD(A, B);

        bw.write(gcd + " " + (A * B) / gcd);
        br.close();
        bw.flush();
        bw.close();
    }
    private static int getGCD(int A, int B) {
        if (A % B == 0)
            return B;
        return  getGCD(B, A % B);
    }
}
