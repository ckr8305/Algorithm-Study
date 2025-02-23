package Y2025.P0223;

import java.io.*;

public class BOJ4779 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while ((input = br.readLine()) != null) {
            int N = Integer.parseInt(input);
            String result = cantor(N);
            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static String cantor(int n) {
        if (n == 0) return "-";
        String prev = cantor(n - 1);
        String space = " ".repeat(prev.length());
        return prev + space + prev;
    }
}