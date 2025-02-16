package Y2025.P2016;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            arr[i][0] = str[0];
            arr[i][1] = str[1];
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (Integer.parseInt(o1[0]) > Integer.parseInt(o2[0]))
                    return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
                else if (Integer.parseInt(o1[0]) < Integer.parseInt(o2[0]))
                    return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
                return 0;
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
