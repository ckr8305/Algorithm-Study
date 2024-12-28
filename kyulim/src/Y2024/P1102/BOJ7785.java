package Y2024.P1102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class BOJ7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> people = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            String name = str[0];
            String status = str[1];

            if (status.equals("enter"))
                people.add(name);
            else people.remove(name);
        }
        ArrayList<String> employees = new ArrayList<>(people);
        Collections.sort(employees, Collections.reverseOrder());

        for (String name : employees) {
            System.out.println(name);
        }

    }
}
