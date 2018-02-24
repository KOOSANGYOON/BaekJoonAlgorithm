package baekJoonContestG;

import java.util.Scanner;

public class BaekJoon_contestG {
	static String result = "";
	static void makeGoal(String goal) {
		if (goal.substring(0, goal.length() / 2).equals(goal.substring(goal.length()/2, goal.length()))) {
			result = result + "C";
			goal = goal.substring(0, goal.length() / 2);
		}else if (goal.substring(0, 1).equals("0")) {
			result = "A" + result;
			goal = goal.substring(1, goal.length());
		}else if (goal.substring(0, 1).equals("1")) {
			result = "B" + result;
			goal = goal.substring(1, goal.length());
		}
//		System.out.println("goal is " + goal);
		if (goal.length() == 1) {
			if (goal.substring(0).equals("0")) {
				result = "A" + result;
				goal = "";
				return;
			}else if (goal.substring(0).equals("1")) {
				result = "B" + result;
				goal = "";
				return;
			}
		}
		makeGoal(goal);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		String finalGoal = scan.next();
		scan.close();
		
		if (finalGoal.length() < 2) {
			System.out.println("-1");
			return;
		}
		String goal = finalGoal.substring(0, finalGoal.length() / 2);
		makeGoal(goal);
//		System.out.println("result is " + result);
		System.out.println(result.length());
	}
}
