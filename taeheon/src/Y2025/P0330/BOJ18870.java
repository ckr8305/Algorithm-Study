package Y2025.P0330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ18870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> sortedList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            sortedList.add(num);
            list.add(num);
        }

        sortedList.sort(null);

        int idx = 0;
        for (int i = 0; i < sortedList.size(); i++) {
            if (!map.containsKey(sortedList.get(i))) {
                map.put(sortedList.get(i), idx++);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i : list) {
            sb.append(map.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}
