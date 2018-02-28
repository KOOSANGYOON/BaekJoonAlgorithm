package baekJoon_2193;

import java.util.Scanner;
/*
 * BaekjoonOnlineJudge#2193 이친수
 * https://www.acmicpc.net/problem/2193
 */
public class BaekJoon_2193_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		long[] pinary = new long[count + 1];
		pinary[0] = 1;
		pinary[1] = 1;
		
		for (int i = 2; i < pinary.length; i++) {
			pinary[i] = pinary[i-1] + pinary[i-2];
		}
		System.out.println(pinary[count-1]);
		scan.close();
	}
}
