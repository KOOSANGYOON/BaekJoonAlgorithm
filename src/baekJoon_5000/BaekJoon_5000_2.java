package baekJoon_5000;

import java.util.Scanner;
/*
 * BaekjoonOnlineJudge#5000 빵정렬
 * https://www.acmicpc.net/problem/5000
 */
public class BaekJoon_5000_2 {
	static int[] current;
	static int[] goal;
	
	static void swipOnce(int lastIndex) {
		if (lastIndex < 2) {
			return;
		}
		int temp = current[lastIndex];
		current[lastIndex] = current[lastIndex-1];
		current[lastIndex-1] = current[lastIndex-2];
		current[lastIndex-2] = temp;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		current = new int[size];
		goal = new int[size];
		
		for (int i = 0; i < size; i++) {
			current[i] = scan.nextInt();
		}
		
		for (int i = 0; i < size; i++) {
			goal[i] = scan.nextInt();
		}
		scan.close();
		
		while (goal != current) {
			
		}
	}
}
