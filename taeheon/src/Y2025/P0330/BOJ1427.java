package Y2025.P0330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class BOJ1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i) - '0');
        }

        list.sort(((o1, o2) -> o2 - o1));
        StringBuilder sb = new StringBuilder();

        for (Integer i : list) {
            sb.append(i);
        }

        System.out.println(sb);
    }
}
