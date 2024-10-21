package P1013;

import java.util.Scanner;

public class BOJ5523 {
	public class java_5523 {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int scoreA = 0;
		int scoreB = 0;
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a>b)
				scoreA++;
			else if(a<b)
				scoreB++;
		}
		System.out.print(scoreA);
		System.out.print(" "+scoreB);
		}
	}
}
	

