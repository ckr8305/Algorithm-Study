package Y2024.P1102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int hour = Integer.parseInt(str[0]);
        int minute = Integer.parseInt(str[1]);

        int time = Integer.parseInt(br.readLine());

        int resultHour = (hour + (minute + time) / 60) % 24;
        int resultMinute = (minute + time) % 60;
        System.out.println(resultHour + " " + resultMinute);
    }
}
