package P1103;

import java.util.Scanner;

public class BOJ1037 {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while(T-- > 0) {
			int N = sc.nextInt();
			max = N > max ? N : max;
		}
		System.out.println(max * min);
	}
 
}
