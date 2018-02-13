package baekJoon_2193;

import java.util.Scanner;

/*
 * BaekjoonOnlineJudge#2193 이친수
 * https://www.acmicpc.net/problem/2193
 */
public class BaekJoon_2193 {
	static int[][] resultList;

	static void updateCarry() {
		for (int i = 0; i < resultList.length; i++) {
			if (resultList[i][0] > 10 && i != resultList.length-1) {
				resultList[i][0] -= 10;
				resultList[i+1][0] += 1;
			}
		}
	}
	
	static void makeFiboList(int totalLength) {
		int temp = 0;
		for (int i = 0; i < totalLength; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 0 && j == 0) {
					resultList[i][j] = 1;
				}else if (i == 0 && j == 1) {
					resultList[i][j] = 1;
				}else {
					resultList[i][j] = resultList[i][j-2] + resultList[i][j-1];
				}
			}
			if (i == 0) {
				resultList[0][0] = 1;
			}else if(i == 1) {
				resultList[0][0] = 1;
			}else {
				resultList[i][0] = resultList[i-2][0] + resultList[i-1][0];
				updateCarry();
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.nextLine();
		scan.close();

		resultList = new int[input][10];
		makeFiboList(input);

//		String result = Double.toString(resultList[input - 1]);
//		result = result.substring(0, result.length()-2);
//		System.out.println(result);
		for (int i = 0; i < resultList.length; i++) {
			System.out.print(resultList[i][0] + " ");
		}
	}
}
