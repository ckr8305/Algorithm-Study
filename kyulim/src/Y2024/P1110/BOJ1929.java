package Y2024.P1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1929 {
    public static int[] arr;
    public static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        M = Integer.parseInt(str[0]);
        N = Integer.parseInt(str[1]);

        arr = new int[N+1];
        eratosthenesSieve();

        for (int i = M; i <= N; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }

    // 에라토스테네스 체 알고리즘
    public static void eratosthenesSieve() {
        for (int i = 2; i <= N; i++) // 1. arr 배열을 숫자로 다 채움
            arr[i] = i;
        for (int i = 2; i <= N; i++) { // 2. 자기 자신을 제외한 배수들을 0으로 설정
            if (arr[i] == 0)
                continue;
            // j 초기값: i+i -> 자기 자신 제외
            // j += i로 i 배수 지정
            for (int j = i + i; j <= N; j += i)
                arr[j] = 0;
        }
    }
}
