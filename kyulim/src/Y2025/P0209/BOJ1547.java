package Y2025.P0209;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1547 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int result = 1;

        for (int i = 0; i < M; i++) {
            String[] str = br.readLine().split(" ");

            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);

            if (x == result)
                result = y;
            else if (y == result)
                result = x;
        }
        System.out.println(result);

        br.close();
    }
}
