package baekJoon_2231;

import java.util.Scanner;

/*
 * BaekjoonOnlineJudge#2231 분해합
 * https://www.acmicpc.net/problem/2231
 */

public class BaekJoon_2231 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputData = scan.nextInt();

        for (int i = inputData; i >= 0; i--) {
            int sumData = 0;
            int target = inputData - i;

            for (int j = 6; j >= 0; j--) {
                int size = (int)Math.pow(10, j);

                if (target / size != 0) {
                    int temp = target / size;
                    sumData += temp;
                    target -= (temp * size);
                }
            }

            if (sumData == i) {
                System.out.print(inputData - i);
                return;
            }
        }
        System.out.print(0);
    }
}
