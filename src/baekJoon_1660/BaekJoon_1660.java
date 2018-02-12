package baekJoon_1660;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * BaekjoonOnlineJudge#1660 캡틴 이다솜
 * https://www.acmicpc.net/problem/1660
 */
public class BaekJoon_1660 {
	static List<Integer> shape = new ArrayList<Integer> ();
	static int smallestCount;
	
	static void fillShapeList(int inputNum) {
		int totalNeeded = 0;
		int addToMakeShape = 0;
		
		for (int i = 1; i <= 120; i++) {
			addToMakeShape += i;
			totalNeeded += addToMakeShape;
			
			if (inputNum < totalNeeded) {
				break;
			}
			shape.add(totalNeeded);
		}
	}
	
	static void makeShape(int remained, int count) {
		if (remained == 0) {
			smallestCount = count - 1;
//			System.out.println("smallest count is : " + smallestCount);
			return;
		}
		
		if (count >= smallestCount) {
			return;
		}
		
		for (int i = shape.size() - 1; i >= 0; i--) {
//			System.out.println("i is " + i);
			if (remained >= shape.get(i)) {
//				System.out.println("select " + shape.get(i));
				makeShape(remained - shape.get(i), count + 1);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		fillShapeList(input);
		
		smallestCount = 300000;
		
		makeShape(input, 1);
		
//		for (int j = 0; j < shape.size(); j++) {
//			System.out.print(shape.get(j) + " ");
//		}
//		System.out.println("result is " + smallestCount);
		
		System.out.println(smallestCount);
	}
}
