package BOJ1027;

import java.util.Scanner;

public class BOJ9498 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (100>= score && score >= 90)
            System.out.println("A");
        else if(score >= 80)
            System.out.println("B");
        else if(score >= 70)
            System.out.println("C");
        else if(score >= 60)
            System.out.println("D");
        else
            System.out.println("F");
        sc.close();
    }
}
