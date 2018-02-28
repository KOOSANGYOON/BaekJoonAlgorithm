package baekJoon_5567;

import java.util.Scanner;
/*
 * BaekjoonOnlineJudge#5567 결혼식
 * https://www.acmicpc.net/problem/5567
 */
public class BaekJoon_5567 {
	static friends[] friendList;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n,m;
		n = scan.nextInt();
		m = scan.nextInt();

		friendList = new friends[n + 1];
		for (int i = 1; i < n + 1; i++) {
			friendList[i] = new friends(n + 1);
		}

		for (int i = 0; i < m; i++) {
			int ai = scan.nextInt();
			int bi = scan.nextInt();
			friendList[ai].addFriend(bi);
			friendList[bi].addFriend(ai);
		}

		int[] result = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			result[i] = 0;
		}

		for (int i = 1; i <= n; i++) {
			if (friendList[1].isExist(i)) {
//				System.out.println(1 + " 의 친구는 " + i + " 입니다. 그렇다면...");
				result[i] = 1;
				for (int j = 1; j <= n; j++) {
					if (friendList[i].isExist(j) && result[j] != 1) {
//						System.out.println(i + " 의 친구는 누구일까요 ? 아직까지 등록이 안되어있는 친구는 바로!! " + j + " 입니다!!!");
						result[j] = 1;
					}
				}
			}
		}
		int count = 0;
		for (int i : result) {
			if (i == 1) {
				count++;
			}
		}
		
		System.out.println(count - 1);
		scan.close();
	}
}

class friends {
	private int[] onesFriends;

	public friends(int n) {
		onesFriends = new int [n];
		for (int i = 1; i < n; i++) {
			this.onesFriends[i] = 0;
		}
	}

	public boolean isExist(int i) {
		return onesFriends[i] == 1;
	}

	public void addFriend(int i) {
		onesFriends[i] = 1;
	}
}
