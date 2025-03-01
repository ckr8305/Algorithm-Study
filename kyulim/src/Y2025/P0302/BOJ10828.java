package Y2025.P0302;

import java.io.*;
import java.util.*;

public class BOJ10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "push":
                    stack.push(Integer.parseInt(command[1]));
                    break;
                case "pop":
                    bw.write(stack.isEmpty() ? "-1\n" : stack.pop() + "\n");
                    break;
                case "size":
                    bw.write(stack.size() + "\n");
                    break;
                case "empty":
                    bw.write(stack.isEmpty() ? "1\n" : "0\n");
                    break;
                case "top":
                    bw.write(stack.isEmpty() ? "-1\n" : stack.peek() + "\n");
                    break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }}