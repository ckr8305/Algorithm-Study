package Y2025.P0413;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<int[]> solution(int n) {
        List<int[]> answer = new ArrayList<>();
        // 큰 거에서 작은 거로 옮겨야 됨
        // 재귀 사용

        hanoi(n, 1, 2, 3, answer);
        return answer;
    }

    static void hanoi(int n, int from, int stopover, int to, List<int[]> answer) {
        if (n == 1) {
            answer.add(new int[] {from, to});
            return;
        }

        // 1에서 2번으로 이동
        hanoi(n - 1, from, to, stopover, answer);
        // 가장 큰 원판을 3으로 이동
        answer.add(new int[] {from, to});
        // 2에서 3번으로 이동
        hanoi(n - 1, stopover, from, to, answer);
    }
}

public class PG하노이의탑 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<int[]> result = solution.solution(3);
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i < result.size() - 1; i++) {
            sb.append("[").append(result.get(i)[0]).append(" ").append(result.get(i)[1]).append("]").append(",");
        }
        sb.append("[").append(result.get(result.size() - 1)[0]).append(" ").append(result.get(result.size() - 1)[1]).append("]");
        sb.append("]");

        System.out.println(sb);
    }
}
