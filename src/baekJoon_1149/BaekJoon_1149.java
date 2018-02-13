package baekJoon_1149;

import java.util.Scanner;

/*
 * BaekjoonOnlineJudge#1149 RGB거리
 * https://www.acmicpc.net/problem/1149
 */
public class BaekJoon_1149 {
	static int cheapestCost;
	static int[][] costList;

	static void searchCheapCost(int count, int skipNum, int beforeCost) {
		if (count == costList.length) {
//			System.out.println("end to search in this line");
			cheapestCost = beforeCost;
			return;
		}

		for (int i = 0; i < 3; i++) {
			if (i == skipNum) {
//				System.out.println("skip because skipNum is " + skipNum);
				continue;
			}

			int recentCost = beforeCost + costList[count][i];
			if (recentCost >= cheapestCost) {
//				System.out.println("it's too expensive. out!");
				continue;
			}
//			System.out.println("go to (count : " + count + ") (cost : " + recentCost + ")");
			searchCheapCost(count + 1, i, recentCost);
		}
	}

	public static void main(String[] args) {
		cheapestCost = Integer.MAX_VALUE;
		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();
		scan.nextLine();

		costList = new int[input][3];

		for (int i = 0; i < input; i++) {
			String[] cost = scan.nextLine().split(" ");
			costList[i][0] = Integer.parseInt(cost[0]);
			costList[i][1] = Integer.parseInt(cost[1]);
			costList[i][2] = Integer.parseInt(cost[2]);
		}

		for (int i = 0; i < 3; i++) {
			searchCheapCost(1, i, costList[0][i]);
		}

		System.out.println(cheapestCost);
		scan.close();
	}
}