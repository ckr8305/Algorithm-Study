package Y2025.P0202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        BigInteger n = new BigInteger(str, 2); // 형변환 - 10진수로
        System.out.println(n.toString(8)); // String으로 형변환 - 8진수로

        br.close();
    }
}
