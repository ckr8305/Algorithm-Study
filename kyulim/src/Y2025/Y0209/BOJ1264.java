package Y2025.Y0209;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            if (line.equals("#")) break;

            int count = 0;
            for (char ch : line.toCharArray()) {
                if ("aeiouAEIOU".indexOf(ch) >= 0) count++;
            }
            System.out.println(count);
        }

        br.close();
    }
}
