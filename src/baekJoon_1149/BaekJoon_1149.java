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
	static List<Integer> totalFillCost = new ArrayList<Integer> ();
	
	static int checkCheapest() {
		if (totalFillCost.size() == 0) {
			return -1;
		}
		
		int result = totalFillCost.get(0);
		for (int cost : totalFillCost) {
			if (result > cost) {
				result = cost;
			}
		}
		return result;
	}
	
	static void fillColor(int houseNum, int colorNum) {
		if (houseNum < 1) {
			return;
		}
		
		int[] costList = totalCostList.get(houseNum - 1);
		int result = costList[colorNum];
		
	}
	
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
		
		for (int i = 0; i < 3; i++) {
//			totalFillCost.add(totalCostList.get(i)[i]);
			fillColor(totalHouseNum, i);
		}
	}
}
