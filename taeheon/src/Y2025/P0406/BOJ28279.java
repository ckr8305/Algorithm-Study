package Y2025.P0406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ28279 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            if (n == 1) {
                deque.offerFirst(Integer.parseInt(st.nextToken()));
            } else if (n == 2) {
                deque.offer(Integer.parseInt(st.nextToken()));
            } else if (n == 3) {
                if (!deque.isEmpty()) sb.append(deque.poll()).append("\n");
                else sb.append(-1).append("\n");
            } else if (n == 4) {
                if (!deque.isEmpty()) sb.append(deque.pollLast()).append("\n");
                else sb.append(-1).append("\n");
            } else if (n == 5) {
                sb.append(deque.size()).append("\n");
            } else if (n == 6) {
                if (deque.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else if (n == 7) {
                if (!deque.isEmpty()) sb.append(deque.peek()).append("\n");
                else sb.append(-1).append("\n");
            } else {
                if (!deque.isEmpty()) sb.append(deque.peekLast()).append("\n");
                else sb.append(-1).append("\n");
            }

        }
        System.out.println(sb);
    }
}
