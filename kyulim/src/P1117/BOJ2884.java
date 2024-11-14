package P1117;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2884 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int hour = Integer.parseInt(str[0]);
        int minute = Integer.parseInt(str[1]);

        if (minute < 45) {
            hour -= 1;
            minute += 15;
            if (hour < 0)
                hour += 24;
        } else
            minute -= 45;

        System.out.println(hour + " " + minute);
    }
}
