package Y2025.P0330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            if (!list.contains(str)) list.add(str);
        }

        list.sort((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            }
            return o1.length() - o2.length();
        });

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}
