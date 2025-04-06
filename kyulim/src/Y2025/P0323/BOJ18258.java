package Y2025.P0323;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int back = -1;  // 마지막 요소 미리 저장

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");

            switch (str[0]) {
                case "push":
                    int num = Integer.parseInt(str[1]);
                    queue.add(num);
                    back = num;  // 마지막 요소 새로 저장
                    break;
                case "pop":
                    sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
                    break;
                case "back":
                    sb.append(queue.isEmpty() ? -1 : back).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
            }
        }

        System.out.println(sb);
        br.close();
    }
}
