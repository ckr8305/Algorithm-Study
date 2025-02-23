package Y2025.P0216;

import java.io.*;
import java.util.*;

public class BOJ20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> wordCount = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() >= M) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        List<String> words = new ArrayList<>(wordCount.keySet());

        words.sort((w1, w2) -> {
            if (!wordCount.get(w1).equals(wordCount.get(w2))) {
                return wordCount.get(w2) - wordCount.get(w1);
            }
            if (w1.length() != w2.length()) {
                return w2.length() - w1.length();
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