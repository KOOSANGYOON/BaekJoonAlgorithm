package baekJoon_2293;

import java.util.Arrays;
import java.util.Scanner;

/*
 * BaekjoonOnlineJudge#2293 동전 1
 * https://www.acmicpc.net/problem/2293
 */
public class BaekJoon_2293 {
	static int[] typesOfCoins;
	static int totalCount = 0;

	static int[] convertToInt(String[] input) {
		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			output[i] = Integer.parseInt(input[i]);
		}
		return output;
	}

	static void chooseCoin(int totalMoney, int index) {
		//		System.out.println("totalMoney is " + totalMoney + " coin is " + typesOfCoins[index] + " index is " + index);
		if (totalMoney == 0) {
			//			System.out.println("total money is zero. So return.");
			totalCount++;
			return;
		}

		for (int i = index; i >= 0; i--) {
			int change = totalMoney;
			if (change < typesOfCoins[i]) {
				continue;
			}
			if (i == 0 && (change % typesOfCoins[i]) == 0) {
				totalCount++;
				return;
			}
			change -= typesOfCoins[i];
			chooseCoin(change, i);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		int[] inputData = convertToInt(input);

		typesOfCoins = new int[inputData[0]];
		int wantToMake = inputData[1];

		for (int i = 0; i < typesOfCoins.length; i++) {
			typesOfCoins[i] = scan.nextInt();
		}

		Arrays.sort(typesOfCoins);

		chooseCoin(wantToMake, typesOfCoins.length - 1);
		System.out.println(totalCount);
		scan.close();
	}
}
