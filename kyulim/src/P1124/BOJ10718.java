package P1124;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BOJ10718 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("강한친구 대한육군");
        bw.newLine();
        bw.write("강한친구 대한육군");

        bw.flush();
        bw.close();
    }
}
