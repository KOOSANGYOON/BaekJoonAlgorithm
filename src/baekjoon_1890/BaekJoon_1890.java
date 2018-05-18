package baekjoon_1890;

import java.util.Scanner;

public class BaekJoon_1890 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[][] game = new int[size][size];
        int[][] roots = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                game[i][j] = scan.nextInt();
                roots[i][j] = 0;
            }
        }
        roots[0][0] = 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j ++) {
                if (game[i][j] == 0 || roots[i][j] == 0) {
                    continue;
                }
                if (j + game[i][j] < size) {
                    roots[i][j + game[i][j]] += roots[i][j];
                }
                if (i + game[i][j] < size) {
                    roots[i + game[i][j]][j] += roots[i][j];
                }
            }
        }

        System.out.println("--Game--");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(game[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("--Roots--");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(roots[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Result is " + roots[size - 1][size - 1]);
    }
}
