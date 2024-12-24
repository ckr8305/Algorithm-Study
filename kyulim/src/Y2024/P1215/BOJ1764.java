package Y2024.P1215;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BOJ1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), 1);
        }

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
            if (map.get(name) == 2)
                list.add(name);
        }
        Collections.sort(list);
        System.out.println(list.toArray().length);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
