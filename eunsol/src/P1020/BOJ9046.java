package P1020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9046 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int num = Integer.parseInt(br.readLine()); //테스트횟수를 입력받는다.
        for (int h = 0; h < num; h++) {
            str = br.readLine().replace(" ", ""); // " "알파벳만 따지기때문에 replace메소드를 이용하여 빈공간제거
            int max = 0;  // 최다 알파벳 인덱스번호 저장
            int count = 0; // 최다 알파벳이 2개 이상일시 ++

            int[] arr = new int[26];
            for (int i = 0; i < str.length(); i++) {
                arr[str.charAt(i) - 'a']++;
            }
            for (int j = 1; j < arr.length; j++) {
                if (arr[max] < arr[j])
                    max = j;
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[max] == arr[i])
                    count++;

            }

            char ch = (char) (max + 'a');
            System.out.println(count > 1 ? "?" : ch);

        }
    }
}
