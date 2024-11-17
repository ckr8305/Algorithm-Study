package P117;

import java.util.Scanner;

public class BOJ2748 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long[] arr = new long[N + 1];
        for (int i = 0; i < N+1; i++)
            arr[i] = -1; 

        arr[0] = 0;
        arr[1] = 1;

        System.out.println(fibonacci(N, arr));
    }


    public static long fibonacci(int N, long[] arr){
        if (arr[N] == -1){
            arr[N] = fibonacci(N-1, arr) + fibonacci(N-2, arr);
        }
        return arr[N];
    }
}
