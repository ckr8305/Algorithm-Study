package Y2025.P0209;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ25192 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        HashSet<String> name = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (str.equals("ENTER")) {
                count += name.size();
                name.clear();
            } else {
                name.add(str);
            }
        }
        System.out.println(count + name.size());
        br.close();
    }
}