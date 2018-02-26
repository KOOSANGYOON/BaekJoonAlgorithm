package baekJoon_9237;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_9237 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] growTime = new int[size];
		for (int i = 0; i < size; i++) {
			growTime[i] = scan.nextInt();
		}
		scan.close();
		
		Arrays.sort(growTime);
		
		for (int i = 0; i < size / 2; i++) {
			int temp = growTime[size - (i + 1)];
			growTime[size - (i + 1)] = growTime[i];
			growTime[i] = temp;
		}
		for (int i = 0; i < size; i++) {
			growTime[i] += (i + 1);
		}
		
		Arrays.sort(growTime);
		
		System.out.println(growTime[size - 1] + 1);
	}
}
