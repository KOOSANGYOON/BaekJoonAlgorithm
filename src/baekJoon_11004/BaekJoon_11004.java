package baekJoon_11004;

import java.util.Arrays;
import java.util.Scanner;

/*
 * BaekjoonOnlineJudge#11004 k번째 수
 * https://www.acmicpc.net/problem/11004
 */

public class BaekJoon_11004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int result = scan.nextInt();

        int[] inputArray = new int[size];

        for (int i = 0; i < size; i++) {
            inputArray[i] = scan.nextInt();
        }

        Arrays.sort(inputArray);
        System.out.print(inputArray[result - 1]);
    }
}
