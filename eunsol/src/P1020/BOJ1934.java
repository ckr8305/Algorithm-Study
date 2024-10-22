package P1020;

import java.util.Scanner;

public class BOJ1934 {
public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       for (int i = 0; i < n; i++) {
           int a = sc.nextInt();
           int b = sc.nextInt();
           System.out.println(a * b / gcd(a, b));
       }
	}
public static int gcd(int a, int b) {
	   if(b == 0) return a;
       else return gcd(b, a % b);
	}
	     
	   }