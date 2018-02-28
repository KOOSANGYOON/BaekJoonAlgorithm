package baekJoon_2217;

import java.util.Arrays;
import java.util.Scanner;
/*
 * BaekjoonOnlineJudge#2217 로프
 * https://www.acmicpc.net/problem/2217
 */
public class BaekJoon_2217 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int[] lopeList = new int[count];
		
		for (int i = 0; i < count; i++) {
			lopeList[i] = scan.nextInt();
		}
		scan.close();
		Arrays.sort(lopeList);
		
		int result = 0;
		for (int i = 0; i < count; i++) {
			if ((lopeList[i] * (count - i)) > result) {
				result = (lopeList[i] * (count - i));
			}
		}
		System.out.println(result);
	}
}
