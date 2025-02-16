package Y2025.P0223;

import java.io.*;
import java.util.*;

public class BOJ1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Set<String> wordSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            wordSet.add(br.readLine());
        }

        List<String> words = new ArrayList<>(wordSet);

        words.sort((w1, w2) -> {
            if (w1.length() != w2.length()) {
                return w1.length() - w2.length();
            }
            return w1.compareTo(w2);
        });

        for (String word : words) {
            bw.write(word + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
