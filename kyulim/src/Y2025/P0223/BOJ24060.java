package Y2025.P0223;

import java.io.*;
import java.util.*;

public class BOJ24060 {
    static int K, count = 0, result = -1;
    static int[] A, temp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        A = new int[N];
        temp = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(0, N - 1);
        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    static void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    static void merge(int left, int mid, int right) {
        int i = left, j = mid + 1, t = left;

        while (i <= mid && j <= right) {
            if (A[i] <= A[j]) temp[t++] = A[i++];
            else temp[t++] = A[j++];
        }

        while (i <= mid) temp[t++] = A[i++];
        while (j <= right) temp[t++] = A[j++];

        for (i = left; i <= right; i++) {
            A[i] = temp[i];
            count++;
            if (count == K) result = A[i];
        }
    }
}
