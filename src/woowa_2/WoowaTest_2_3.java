package woowa_2;

import java.util.Scanner;

public class WoowaTest_2_3 {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in))
        {
            int x1 = s.nextInt();
            int y1 = s.nextInt();
            int x2 = s.nextInt();
            int y2 = s.nextInt();
            int x3 = s.nextInt();
            int y3 = s.nextInt();
            int x4 = s.nextInt();
            int y4 = s.nextInt();
            int x5 = s.nextInt();
            int y5 = s.nextInt();
            int x6 = s.nextInt();
            int y6 = s.nextInt();

            //여기부터 작성해 주세요
            int xLength = x2 - x1;
            int yLength = y2 - y1;
            long sizeA = xLength * yLength;

            int xAB = Math.min(x2, x4) - Math.max(x1, x3);
            int yAB = Math.min(y2, y4) - Math.max(y1, y3);
            long sizeAB = xAB * yAB;

            int xAC = Math.min(x2, x6) - Math.max(x1, x5);
            int yAC = Math.min(y2, y6) - Math.max(y1, y5);
            long sizeAC = xAC * yAC;

            int xBC = Math.min(x4, x6) - Math.max(x3, x5);
            int yBC = Math.min(y4, y6) - Math.max(y3, y5);
            long sizeBC = xBC * yBC;

            long result = sizeA - sizeAB - sizeAC + sizeBC;
            System.out.println(result);
        }
    }
}
