package BOJ1027;

import java.util.Scanner;

public class BOJ10798 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][15]; 
        

        for(int i = 0; i < 5; i++){ 
            String str = sc.nextLine(); 
            for(int j = 0; j < str.length(); j++){ 
                arr[i][j] = str.charAt(j); 
            }
        }
        for(int j = 0; j < arr[0].length; j++){
            for(int i = 0; i < 5; i++){
                if (arr[i][j] == 0) { 
                    continue; 
                }
                System.out.print(String.valueOf(arr[i][j])); 
            }
        }
    }


}
