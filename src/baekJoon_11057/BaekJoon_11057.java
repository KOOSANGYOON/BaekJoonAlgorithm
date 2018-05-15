package baekJoon_11057;

import java.util.Scanner;

/*
 * BaekjoonOnlineJudge#11057 오르막 수
 * https://www.acmicpc.net/problem/11057
 */

public class BaekJoon_11057 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();

        long[][] resultNum = new long[inputNum + 1][10];

        for (int i = 0; i < 10; i++) {
            resultNum[0][i] = 1;
        }

        for (int j = 1; j <= inputNum; j++) {
            for (int k = 0; k < 10; k++) {
                resultNum[j][k] = calSum(resultNum, j, k);
            }
        }

        /*
        출력부
        */
        for (int l = 0; l <= inputNum; l++) {
            for (int m = 0; m < 10; m++) {
                System.out.print(resultNum[l][m] + " ");
            }
            System.out.println("");
        }

        System.out.println("result is : " + resultNum[inputNum][9]);
    }

    private static long calSum(long[][] resultNum, int j, int k) {
        long result = 0;
        for (int i = 0; i <= k; i++) {
            result += resultNum[j - 1][i];
        }
        if (result >= 10007) {
            return result % 10007;
        }
        return result;
    }
}
