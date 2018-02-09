package baekJoon_1003;

import java.util.Arrays;
import java.util.Scanner;

/*
 * BaekjoonOnlineJudge#1003 피보나치 함수
 * https://www.acmicpc.net/problem/1003
 */
public class BaekJoon_1003 {
	static int[] countList = {0, 0};
	
	static void clearList() {
		countList[0] = 0;
		countList[1] = 0;
	}
	
	static int fibonacci(int n) {
		if (n == 0) {
			countList[0]++;
			return 0;
		}else if (n == 1) {
			countList[1]++;
			return 1;
		}else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int tryNum = scan.nextInt();
		
		for (int i = 0; i < tryNum; i++) {
			fibonacci(scan.nextInt());
			System.out.println(countList[0] + " " + countList[1]);
			clearList();
		}
	}
}
