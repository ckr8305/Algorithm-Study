package Y2024.P1013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ5523 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 게임 라운드

        int Awin = 0;
        int Bwin = 0;

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()); // A 점수
            int B = Integer.parseInt(st.nextToken()); // B 점수

            if(A > B) {
                Awin++;
            }else if(B > A) {
                Bwin++;
            }
        }
        System.out.println(Awin + " " + Bwin);
    }
}
