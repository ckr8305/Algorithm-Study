package Y2025.P0112;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ4949 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = br.readLine();
            if (str.equals(".")) {
                break;
            }
            bw.write(isBalancedString(str) ? "yes\n" : "no\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static boolean isBalancedString(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            } else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
