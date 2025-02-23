package Y2025.P0216;

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

        br.close();

        String[] words = wordSet.toArray(new String[0]);

        int len = words.length;
        for (int i = 0; i < len - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < len; j++) {
                if (words[j].length() < words[minIdx].length() ||
                    (words[j].length() == words[minIdx].length() && words[j].compareTo(words[minIdx]) < 0)) {
                    minIdx = j;
                }
            }

            String temp = words[i];
            words[i] = words[minIdx];
            words[minIdx] = temp;
        }

        for (String word : words) {
            bw.write(word + "\n");
        }

        bw.flush();
        bw.close();
    }
}
