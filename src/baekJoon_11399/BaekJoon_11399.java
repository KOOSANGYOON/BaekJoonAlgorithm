package baekJoon_11399;

import java.util.Arrays;
import java.util.Scanner;

/*
 * BaekjoonOnlineJudge#11399 ATM
 * https://www.acmicpc.net/problem/11399
 */
public class BaekJoon_11399 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int[] timeList = new int[count];
		for (int i = 0; i < count; i++) {
			timeList[i] = scan.nextInt();
		}
		scan.close();
		
		Arrays.sort(timeList);
		
		int totalTime = 0;
		for (int i = 0; i < count; i++) {
			totalTime += timeList[i] * (count - i);
		}
		System.out.println(totalTime);
	}
}
