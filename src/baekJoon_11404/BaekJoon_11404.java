package baekJoon_11404;

import java.util.Scanner;

public class BaekJoon_11404 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int totalCityNum = scan.nextInt();
		int[][] costTable = new int[totalCityNum][totalCityNum];
		for (int i = 0; i < totalCityNum; i++) {
			for (int j = 0; j < totalCityNum; j++) {
				costTable[i][j] = 0;
			}
		}

		int totalBusNum = scan.nextInt();
		for (int i = 0; i < totalBusNum; i++) {
			int startCity = scan.nextInt();
			int destination = scan.nextInt();
			int cost = scan.nextInt();

			if (costTable[startCity-1][destination-1] == 0 || costTable[startCity-1][destination-1] > cost) {
				costTable[startCity-1][destination-1] = cost;
			}
		}
		
		scan.close();

		for (int k = 0; k < totalCityNum; k++) {
			for (int i = 0; i < totalCityNum; i++) {
				for (int j = 0; j < totalCityNum; j++) {
					if (costTable[i][k] == 0 || costTable[k][j] == 0) {
						continue;
					}
					if (costTable[i][j] > costTable[i][k] + costTable[k][j] || (costTable[i][j] == 0 && (costTable[i][k] + costTable[k][j]) != 0)) {
//						System.out.println("k is " + k + " / i is " + i + " / j is " + j);
//						System.out.println("So, " + costTable[i][j] + " is changed with " + (costTable[i][k] + costTable[k][j]));
						costTable[i][j] = costTable[i][k] + costTable[k][j];
					}
				}
			}
		}

		for (int i = 0; i < totalCityNum; i++) {
			for (int j = 0; j < totalCityNum; j++) {
				if (i == j) {
					costTable[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < totalCityNum; i++) {
			for (int j = 0; j < totalCityNum; j++) {
				System.out.print(costTable[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
