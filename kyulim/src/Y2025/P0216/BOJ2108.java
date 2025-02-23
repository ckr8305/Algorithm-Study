package Y2025.P0216;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] frequency = new int[8001];

        int sum = 0;
        int min = 4001, max = -4001;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            frequency[arr[i] + 4000]++; // 배열 인덱스 : 음수 불가능
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        Arrays.sort(arr);

        br.close();

        int mode = 0, maxFreq = 0;
        boolean second = false;
        for (int i = 0; i < 8001; i ++) {
            if (frequency[i] > maxFreq) {
                maxFreq = frequency[i];
                mode = i - 4000;
                second = false;
            } else if (frequency[i] == maxFreq && ! second) {
                mode = i - 4000;
                second = true;
            }
        }

        System.out.println(Math.round((double) sum / N));
        System.out.println(arr[N / 2]);
        System.out.println(mode);
        System.out.println(max - min);

        bw.flush();
        bw.close();
    }
}
