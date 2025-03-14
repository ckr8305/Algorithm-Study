package Y2025.P0323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ28278 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if (num == 1) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (num == 2) {
                if (!stack.isEmpty()) {
                    sb.append(stack.pop()).append("\n");
                } else sb.append(-1).append("\n");
            } else if (num == 3) {
                sb.append(stack.size()).append("\n");
            } else if (num == 4) {
                if (stack.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else {
                if (!stack.isEmpty()) {
                    sb.append(stack.peek()).append("\n");
                } else sb.append(-1).append("\n");
            }
        }

        System.out.println(sb);
    }
}
