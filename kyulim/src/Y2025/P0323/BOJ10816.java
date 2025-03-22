package Y2025.P0323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Map<Integer, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        String[] nStr = br.readLine().split(" ");

        int M = Integer.parseInt(br.readLine());
        String[] mStr = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            map.put(Integer.parseInt(nStr[i]), map.getOrDefault(Integer.parseInt(nStr[i]), 0) + 1);
        }

        for (int i = 0; i < M; i++) {
            sb.append(map.getOrDefault(Integer.parseInt(mStr[i]), 0)).append(" ");
        }

        br.close();
        System.out.println(sb.toString());
    }
}
