package Y2025.P0406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);

            switch (n) {
                case 1 :
                    deque.offerFirst(Integer.parseInt(str[1]));
                    break;
                case 2 :
                    deque.offer(Integer.parseInt(str[1]));
                    break;
                case 3 :
                    if (!deque.isEmpty()) sb.append(deque.pollFirst()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
                case 4 :
                    if (!deque.isEmpty()) sb.append(deque.pollLast()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
                case 5 :
                    sb.append(deque.size()).append("\n");;
                    break;
                case 6 :
                    if (deque.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case 7 :
                    if (!deque.isEmpty()) sb.append(deque.peekFirst()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
                case 8 :
                    if (!deque.isEmpty()) sb.append(deque.peekLast()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
            }
        }
        System.out.println(sb);
        br.close();
    }
}
