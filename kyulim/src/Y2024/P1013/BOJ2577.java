package Y2024.P1013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10]; // 각 숫자 빈도수 저장

        // 입력된 수 곱
        int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        String str = String.valueOf(val);

        // str 각 자릿수 순회하며 해당 숫자의 빈도 arr 배열에 기록
        for (int i = 0; i < str.length(); i++) {
            arr[(str.charAt(i) - 48)]++; // 0의 아스키코드 : 48
        }

        for (int v : arr) {
            System.out.println(v);
        }

    }
}
