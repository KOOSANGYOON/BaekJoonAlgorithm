package baekJoon_2193;

import java.util.Scanner;

public class BaekJoon_2193_2 {
	static count[] totalCount;
	
	static int pinaryNum(int input) {
		if (input == 0) {
			return 1;
		}else if (input == 1) {
			return 1;
		}
		return pinaryNum(input - 2) + pinaryNum(input - 1);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		totalCount = new count[input];
		for (int i = 0; i < totalCount.length; i++) {
			totalCount[i] = new count();
		}
		
		int result = pinaryNum(input - 1);
		
		System.out.println(result);
	}
}

class count {
	private int[][] totalScore = new int[50][1];
	
	public count() {
		for (int i = 0; i < 50; i++) {
			this.totalScore[i][0] = 0;
		}
	}
}
