package baekJoonContestA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJoon_contestA {
	static List<Integer> resultList = new ArrayList<Integer> ();
	
	static int makeInteger(int[] inputList) {
		String output = "";
		for (int i : inputList) {
			output += Integer.toString(i);
		}
		return Integer.parseInt(output);
	}
	
	static int[] reverse(int[] inputList) {
		int[] output = new int[inputList.length];
		for (int i = 0; i < inputList.length; i++) {
			output[inputList.length - (i + 1)] = inputList[i];
		}
		return output;
	}
	
	static int[] swiftLeft(int[] inputList) {
		int[] output = new int[inputList.length];
		int temp = inputList[0];
		for (int i = 1; i < inputList.length; i++) {
			output[i-1] = inputList[i];
		}
		output[inputList.length-1] = temp;
		return output;
	}
	
	static int[] swiftRight(int[] inputList) {
		int[] output = new int[inputList.length];
		int temp = inputList[inputList.length-1];
		for (int i = inputList.length - 2; i >= 0; i--) {
			output[i + 1] = inputList[i];
		}
		output[0] = temp;
		return output;
	}
	
	static void puzzle(int[] inputList, int count) {
		if (resultList.contains(makeInteger(inputList))) {
			return;
		}
		if (count >= inputList.length) {
			System.out.println("too long so return.");
			return;
		}
		
//		System.out.println("add this num " + makeInteger(inputList));
		resultList.add(makeInteger(inputList));
		puzzle(reverse(inputList), count + 1);
		puzzle(swiftLeft(inputList), count + 1);
		puzzle(swiftRight(inputList), count + 1);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] inputList = new int[input];
		int[] goalList = new int[input];
		
		for (int i = 0; i < input; i++) {
			inputList[i] = scan.nextInt();
		}
		for (int i = 0; i < input; i++) {
			goalList[i] = scan.nextInt();
		}
		
		puzzle(inputList, 1);
		
		if (resultList.contains(makeInteger(goalList))) {
			System.out.println("good puzzle");
		}else {
			System.out.println("bad puzzle");
		}
		scan.close();
	}
}
