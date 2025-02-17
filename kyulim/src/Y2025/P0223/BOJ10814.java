package Y2025.P0223;

import java.io.*;
import java.util.*;

public class BOJ10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Member> members = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            members.add(new Member(age, name, i));
        }

        members.sort(Comparator.comparingInt((Member m) -> m.age).thenComparingInt(m -> m.index));

        for (Member member : members) {
            bw.write(member.age + " " + member.name + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    static class Member {
        int age, index;
        String name;

        public Member(int age, String name, int index) {
            this.age = age;
            this.name = name;
            this.index = index;
        }
    }
}
