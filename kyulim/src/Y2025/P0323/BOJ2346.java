package Y2025.P0323;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

// 덱
public class BOJ2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        Deque<int[]> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            deque.add(new int[]{i + 1, Integer.parseInt(str[i])}); // [풍선 번호, 종이 번호] 저장
        }

        int[] balloon = deque.pollFirst(); // 첫 번째 풍선
        sb.append(balloon[0]).append(" ");
        int index = balloon[1]; // 풍선 종이 번호 - 이동 값

        while(!deque.isEmpty()) {
            if (index > 0) {
                for (int i = 0; i < index - 1; i++) {
                    deque.addLast(deque.pollFirst()); // 앞에서 꺼내서 뒤로 보냄
                }
                balloon = deque.pollFirst(); // 앞 풍선 터뜨리기
            }
            else {
                for (int i = 0; i < -index -1; i++) { // 음수인 경우 -> -index
                    deque.addFirst(deque.pollLast()); // 뒤에서 꺼내서 앞으로 보냄
                }
                balloon = deque.pollLast(); // 뒤 풍선 터뜨리기
            }
            sb.append(balloon[0]).append(" ");
            index = balloon[1];
        }

        br.close();
        System.out.println(sb.toString());
    }
}
