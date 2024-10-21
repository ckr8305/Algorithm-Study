package P1020;

import java.util.Scanner;

public class BOJ3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[10];
        boolean bl; 
        int count = 0;
        
        for(int i=0; i<arr.length; i++) {
        	arr[i] = sc.nextInt()%42;
        }
        
        for(int i=0; i<arr.length; i++) {
        	bl = false; 
            for(int j=i+1; j<arr.length; j++) {
            	if(arr[i] == arr[j]) {
                	bl = true;
                    break;
                }
            }
            if(bl==false) {
            	count++;
            }
        }
        
        System.out.println(count);

	}

}
