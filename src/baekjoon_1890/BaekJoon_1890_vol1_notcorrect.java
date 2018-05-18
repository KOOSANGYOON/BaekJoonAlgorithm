package baekjoon_1890;

import java.util.Scanner;

public class BaekJoon_1890_vol1_notcorrect {
    private static int result = 0;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[][] game = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                game[i][j] = scan.nextInt();
            }
        }

        jumpRight(game, size, 0, 0);
        jumpDown(game, size, 0, 0);
        System.out.println("result is " + result);
    }

    private static void jumpRight(int[][] game, int gameSize, int i, int j) {
        System.out.println("--Jump Right!--");
        System.out.println("-- i : " + i + " , j : " + j + " --");
        if (game[i][j] == 0) {
            return;
        }
        if (game[i][j] + j >= gameSize) {
            System.out.println("error. size is too big.");
            return;
        }
        if (game[i][j] == (gameSize - 1 - i) && j == gameSize - 1) {
            result++;
            System.out.println("good.");
            return;
        }
        if (game[i][j] == (gameSize - 1 - j) && i == gameSize - 1) {
            result++;
            System.out.println("good.");
            return;
        }
        j += game[i][j];
        jumpRight(game, gameSize, i, j);
        jumpDown(game, gameSize, i, j);
    }

    private static void jumpDown(int[][] game, int gameSize, int i, int j) {
        System.out.println("--Jump Down!--");
        System.out.println("i : " + i + " , j : " + j);
        if (game[i][j] == 0) {
            return;
        }
        if (game[i][j] + i >= gameSize) {
            System.out.println("error. size is too big.");
            System.out.println("-status- i : " + i + " , j : " + j);
            return;
        }
        if (game[i][j] == (gameSize - 1 - i) && j == gameSize - 1) {
            result++;
            System.out.println("good.");
            return;
        }
        if (game[i][j] == (gameSize - 1 - j) && i == gameSize - 1) {
            result++;
            System.out.println("good.");
            return;
        }
        i += game[i][j];
        jumpRight(game, gameSize, i, j);
        jumpDown(game, gameSize, i, j);
    }
}

