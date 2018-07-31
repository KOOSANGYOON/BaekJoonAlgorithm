package woowa_2;

import java.io.*;
import java.util.Scanner;

public class WoowaTest_2_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int size = Integer.parseInt(input);

        double[] result = new double[size * 2];
        for (int i = 0; i < result.length; i++) {
            result[i] = 0;
        }

        String[] inputData = new String[2];
        for (int i = 0; i < size; i++) {
            inputData = br.readLine().split(" ");
            int a = Integer.parseInt(inputData[0]);
            int b = Integer.parseInt(inputData[1]);
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            result[i] = a;
            result[i + 1] = b;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }
}
