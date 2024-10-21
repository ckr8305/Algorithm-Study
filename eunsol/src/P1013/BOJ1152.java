package P1013;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ1152 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String in = scanner.nextLine();
		
	
		StringTokenizer string = new StringTokenizer(in, " ");
		System.out.println(string.countTokens());

		scanner.close();
	}

}
