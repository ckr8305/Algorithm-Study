package BOJ1027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if (N < 1 || N > 500000) {
			return;
		}
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Set<Integer> NArray = new HashSet<Integer>();
		for (int i = 0; i < N; i++) {
			NArray.add(Integer.parseInt(st.nextToken()));
		}
		int M = Integer.parseInt(br.readLine());
		if (M < 1 || M > 500000) {
			return;
		}
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			sb.append(NArray.contains(Integer.parseInt(st2.nextToken())) ? 1 : 0).append(" ");
		}
		br.close();
		System.out.println(sb);
	}
}
