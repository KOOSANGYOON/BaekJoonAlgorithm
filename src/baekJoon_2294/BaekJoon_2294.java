package baekJoon_2294;

import java.util.Scanner;

/*
 * BaekjoonOnlineJudge#2294 동전 2 (Not complete)
 * https://www.acmicpc.net/problem/2294
 */

public class BaekJoon_2294 {
    public static int resultCount = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int coinCount = scan.nextInt();
        int totalSize = scan.nextInt();

        int[] coins = new int[coinCount];
        for (int i = 0; i < coinCount; i++) {
            coins[i] = scan.nextInt();
        }

        calResult(totalSize, coins, 0);

        if (resultCount == 0) {
            System.out.println(-1);
        } else {
            System.out.println(resultCount);
        }
    }

    private static void calResult(int totalSize, int[] coins, int count) {
        System.out.println("--------------------------");
        System.out.println("totalsize : " + totalSize);
        System.out.println("count : " + count);
        System.out.println("result : " + resultCount);
        System.out.println("--------------------------");
        if (totalSize == 0) {
            if (resultCount == 0 || resultCount > count) {
                System.out.println("<<<<<<<<< add count!! >>>>>>>>>>");
                resultCount = count;
                return;
            } else if (resultCount <= count) {
                return;
            }
        }

        if (resultCount <= count && resultCount != 0) {
            return;
        }

        if (count < resultCount - 1 && exist(coins, totalSize)) {
            resultCount = count + 1;
            return;
        }else if (count == resultCount - 1 && !exist(coins, totalSize)) {
            return;
        }

        for (int i = coins.length - 1; i >= 0; i--) {
            if (totalSize >= coins[i]) {
                totalSize -= coins[i];
                count++;
            } else {
                continue;
            }
            calResult(totalSize, coins, count);
            totalSize += coins[i];
            count--;
        }
    }

    private static boolean exist(int[] coins, int totalSize) {
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] == totalSize) {
                return true;
            }
        }
        return false;
    }
}
