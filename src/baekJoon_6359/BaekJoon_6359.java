package baekJoon_6359;

import java.util.Scanner;

/*
 * BaekjoonOnlineJudge#6359 만취한 상범
 * https://www.acmicpc.net/problem/6359
 */
public class BaekJoon_6359 {
	static int countOpenedRoom(boolean[] room) {
		int count = 0;
		
		for (int i = 0; i < room.length; i++) {
			if (room[i] == true) {
				count++;
			}
		}
		return count;
	}
	
	static boolean[] initializeRoom(boolean[] room) {
		for (int i = 0; i < room.length; i++) {
			room[i] = false;
		}
		return room;
	}
	
	static boolean[] playGame(boolean[] totalRoom, int roundNum) {
		if (roundNum > totalRoom.length) {
			return totalRoom;
		}
		
		for (int i = 0; i < totalRoom.length; i++) {
			if ((i + 1) % roundNum == 0) {
				totalRoom[i] = !totalRoom[i];
			}
		}
		
		return playGame(totalRoom, roundNum + 1);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int gameNum = scan.nextInt();
		
		for (int i = 0; i < gameNum; i++) {
			int roomCount = scan.nextInt();
			
			boolean[] totalRoom = new boolean[roomCount];
			totalRoom = initializeRoom(totalRoom);
			
			totalRoom = playGame(totalRoom, 1);
			
			int result = countOpenedRoom(totalRoom);
			
			System.out.println(result);
		}
		
		scan.close();
	}
}
