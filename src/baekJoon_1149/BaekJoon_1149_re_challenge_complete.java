package baekJoon_1149;

import java.util.Scanner;

/*
 * BaekjoonOnlineJudge#1149 RGB거리
 * https://www.acmicpc.net/problem/1149
 */

public class BaekJoon_1149_re_challenge_complete {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();
        int[][] costTable = new int[inputNum][3];
        int[][] cheapestCost = new int[inputNum][3];

        for(int i = 0; i < inputNum; i++){
            for(int j = 0; j < 3; j++){
                costTable[i][j] = scan.nextInt();
            }
        }

        //초기값 세팅
        cheapestCost[0][0] = costTable[0][0];
        cheapestCost[0][1] = costTable[0][1];
        cheapestCost[0][2] = costTable[0][2];

        for(int i = 1; i < inputNum; i++){
            cheapestCost[i][0] = Math.min(cheapestCost[i-1][1], cheapestCost[i-1][2]) + costTable[i][0];
            cheapestCost[i][1] = Math.min(cheapestCost[i-1][0], cheapestCost[i-1][2]) + costTable[i][1];
            cheapestCost[i][2] = Math.min(cheapestCost[i-1][0], cheapestCost[i-1][1]) + costTable[i][2];
        }

        int result = Math.min(Math.min(cheapestCost[inputNum-1][0], cheapestCost[inputNum-1][1]), cheapestCost[inputNum-1][2]);
        System.out.println(result);
    }
}
