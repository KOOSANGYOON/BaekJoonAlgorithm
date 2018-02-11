package baekJoon_1149;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * BaekjoonOnlineJudge#1149 RGB거리
 * https://www.acmicpc.net/problem/1149
 */
public class BaekJoon_1149 {
	static List<int[]> totalCostList = new ArrayList<int[]> ();
	
	static int[] convertToInteger(String[] input) {
		int[] result = new int[input.length];
		
		for (int i = 0; i < input.length; i++) {
			result[i] = Integer.parseInt(input[i]);
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int totalHouseNum = scan.nextInt();
		scan.nextLine();
		
		for (int i = 0; i < totalHouseNum; i++) {
			String[] stringCost = scan.nextLine().split(" ");
			int[] colorCost = convertToInteger(stringCost);
			totalCostList.add(colorCost);
		}
		
		for (int[] cost : totalCostList) {
			for (int i : cost) {
				System.out.println(i);
			}
		}
	}
}
