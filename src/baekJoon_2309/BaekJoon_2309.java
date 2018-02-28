package baekJoon_2309;

import java.util.Arrays;
import java.util.Scanner;

/*
 * BaekjoonOnlineJudge#2309 일곱난쟁이
 * https://www.acmicpc.net/problem/2309
 */
public class BaekJoon_2309 {
	static void printResult(int[] list, int a, int b) {
		for (int i = 0; i < list.length; i++) {
			if (i == a || i == b) {
				continue;
			}
			System.out.println(list[i]);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] shortManList = new int[9];
		for (int i = 0; i < 9; i++) {
			shortManList[i] = scan.nextInt();
		}
		scan.close();
		Arrays.sort(shortManList);
		
		int skipNumOne = 8;
		int skipNumTwo = 7;
		int result = 0;
		
		while(skipNumTwo >= 0) {
			int count = 0;
			for (int j = 0; j < shortManList.length; j++) {
				if (j == skipNumOne || j == skipNumTwo) {
					continue;
				}
				result += shortManList[j];
				count++;
				if (result == 100 && count == 7) {
					printResult(shortManList, skipNumOne, skipNumTwo);
					return;
				}
			}
			if (skipNumTwo == 0) {
				skipNumOne--;
				skipNumTwo = skipNumOne - 1;
				result = 0;
			}else {
				skipNumTwo--;
				result = 0;
			}
		}
	}
}
