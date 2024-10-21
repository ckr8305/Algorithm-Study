package P1013;

import java.util.Scanner;

public class BOJ2577 {
	public static void main(String[] args) {
		int [] number = new int[3];
		Scanner sc = new Scanner(System.in);
		int multiple = 1;
		
		for (int i=0; i<number.length; i++) {
			number[i]= sc.nextInt();
			multiple *= number[i];
		}

		String str = Integer.toString(multiple);
	
		for (int i=0; i<10; i++) {
			int count=0;
			for( int j=0; j<str.length(); j++) {
				if(str.charAt(j)-'0' ==i) {
					count++; }		
		}		
			System.out.println(count);
		}	
	}
}
