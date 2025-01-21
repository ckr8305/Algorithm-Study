package Y2025.P0202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ1373 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        BigInteger n = new BigInteger(s, 2);
        String string = n.toString(8);
        System.out.println(string);
    }
}
