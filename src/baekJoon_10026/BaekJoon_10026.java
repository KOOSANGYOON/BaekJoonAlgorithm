package baekJoon_10026;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_10026 {
	static String[][] RGBtable;
	static boolean[][] isVisited;

	static int inputData() {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		RGBtable = new String[size][size];
		isVisited = new boolean[size][size];

		for (int i = 0; i < size; i++) {
			String oneLine = scan.next();
			for (int j = 0; j < oneLine.length(); j++) {
				RGBtable[i][j] = Character.toString(oneLine.charAt(j));
				isVisited[i][j] = false;
			}
		}

		return size;
	}

	static void checkZone(int size) {
		Queue<String> q = new LinkedList<String> ();
		//		HashMap<String, Boolean> hash = new HashMap<String, Boolean>(); 

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (!isVisited[i][j]) {
					q.offer(RGBtable[i][j]);
					isVisited[i][j] = true;
					
					String temp = q.poll();
					
				}
			}
		}
	}
	
	static void checkAround() {
		
	}

	public static void main(String[] args) {
		checkZone(inputData());
	}
}
