package Y2024.P1215;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ10951 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st;
            String str = "";

            while((str=br.readLine()) != null) {
                st = new StringTokenizer(str);
                if(st.hasMoreTokens()) {
                    bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
                }else {
                    break;
                }
            }
            br.close();
            bw.flush();
            bw.close();
    }
}
