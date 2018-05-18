package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        A[0] = 5;
        A[1] = -3;
        A[2] = 6;
        A[3] = 4;
        A[4] = 8;

        B[0] = 2;
        B[1] = 6;
        B[2] = -5;
        B[3] = 1;
        B[4] = 0;

        int result = solution(A, B, 5);
        System.out.println(result);
    }

    private static int solution(int A[], int B[], int N) {
        boolean isChanged = false;
        int result = 0;
        for (int i = 0; i < N - 1; i++) {
            if (A[i] >= A[i + 1] || B[i] >= B[i + 1]) {
                int temp = 0;
                temp = A[i + 1];
                A[i + 1] = B[i + 1];
                B[i + 1] = temp;
                result++;
                isChanged = true;

                if (A[i] >= A[i + 1] || B[i] >= B[i + 1]) {
                    return -1;
                }
            }
        }
        if (isChanged == false) {
            return 0;
        }
        return result;
    }

}
