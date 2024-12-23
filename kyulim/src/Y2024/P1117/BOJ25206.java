package Y2024.P1117;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25206 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        double totalCredits = 0;

        for (int i = 0; i < 20; i++) {
            String[] s = br.readLine().split(" ");
            double credit = Double.parseDouble(s[1]);
            String grade = s[2];

            if (grade.equals("P"))
                continue;
            double gradeValue = 0;

            switch (grade) {
                case "A+" : gradeValue = 4.5;
                    break;
                case "A0" : gradeValue = 4.0;
                    break;
                case "B+" : gradeValue = 3.5;
                    break;
                case "B0" : gradeValue = 3.0;
                    break;
                case "C+" : gradeValue = 2.5;
                    break;
                case "C0" : gradeValue = 2.0;
                    break;
                case "D+" : gradeValue = 1.5;
                    break;
                case "D0" : gradeValue = 1.0;
                    break;
                case "F" : gradeValue = 0.0;
                    break;
            }
            sum += credit * gradeValue;
            totalCredits += credit;
        }
        System.out.println(sum / totalCredits);
    }
}
