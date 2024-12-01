package P1013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26]; // 알파벳 개수
        String s = br.readLine();

        // s 문자 순회하며 해당 문자가 소문자인지 대문자인지 구분하여 인덱스에 빈도 기록
        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') { // a~z사이면
                arr[s.charAt(i) - 97]++; // 'a' 기준으로 인덱스 결정
            } else {
                arr[s.charAt(i) - 65]++; // 'A' 기준으로 인덱스 결정
            }
        }

        // 최대 빈도 알파벳 찾기
        int max = -1;
        char ch = '?';
        for (int i = 0; i < 26; i++) {

            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65); // 대문자로 변환
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}
