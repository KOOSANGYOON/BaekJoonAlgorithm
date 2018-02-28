package baekJoon_11047;

import java.util.Arrays;
import java.util.Scanner;

/*
 * BaekjoonOnlineJudge#11047 동전 0
 * https://www.acmicpc.net/problem/11047
 */
public class BaekJoon_11047 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int goal = scan.nextInt();
		int[] coinList = new int[count];
		
		for (int i = 0; i < count; i++) {
			coinList[i] = scan.nextInt();
		}
		scan.close();
		Arrays.sort(coinList);
		
		int result = 0;
		for (int i = count-1; i >= 0; i--) {
			if (goal < coinList[i]) {
				continue;
			}
			if (goal == 0) {
				break;
			}
			
			int temp = goal / coinList[i];
			goal -= (coinList[i] * temp);
			result += temp;
		}
		System.out.println(result);
	}
}
