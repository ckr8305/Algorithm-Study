package P1222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strA = br.readLine().split(" ");
        int aNumerator = Integer.parseInt(strA[0]);
        int aDenominator = Integer.parseInt(strA[1]);

        String[] strB = br.readLine().split(" ");
        int bNumerator = Integer.parseInt(strB[0]);
        int bDenominator = Integer.parseInt(strB[1]);

        int resultDenominator = aDenominator * bDenominator;
        int resultNumerator = (aNumerator * bDenominator) + (bNumerator * aDenominator);

        int gcd = gcd(resultNumerator, resultDenominator);

        System.out.println((resultNumerator / gcd) + " " + (resultDenominator / gcd));
    }

    // 최대공약수(GCD)를 구하는 메서드 (유클리드 호제법 사용)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return Math.abs(a); // 항상 양수로 반환
    }
}
