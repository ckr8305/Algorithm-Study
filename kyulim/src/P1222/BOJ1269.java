package P1222;

import java.io.*;
import java.util.HashSet;

public class BOJ1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);

        HashSet<Integer> set = new HashSet<>();

        String[] strA = br.readLine().split(" ");
        for (int i = 0; i < A; i++) {
            int num = Integer.parseInt(strA[i]);
            set.add(num);
        }

        String[] strB = br.readLine().split(" ");
        for (int i = 0; i < B; i++) {
            int num = Integer.parseInt(strB[i]);
            if (!set.add(num)) {
                set.remove(num);
            }
        }

        System.out.println(set.size());
    }
}
