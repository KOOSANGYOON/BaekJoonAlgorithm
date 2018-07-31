package woowa_2;

import java.util.LinkedList;
import java.util.Scanner;

public class woowaTest {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in))
        {
            int n = s.nextInt();
            int d = s.nextInt();
            int k = s.nextInt();
            int j = s.nextInt();

            //여기부터 작성해 주세요
            LinkedList<Integer> link = new LinkedList<Integer>();
            if (d == 0) {       //좌측이동
                link.addLast(1);
                for (int i = n; i > 1; i--) {
                    link.addLast(i);
                }
            }else if (d == 1) {     //우측이동
                for (int i = 0; i < n; i++) {
                    link.addLast(i + 1);
                }
            }

//            int position = 0;
////            while(link.size() > 1) {
////                link.remove((position + k) % link.size());
////                position = (position + (k - 1)) % link.size();
////                k += j;
////            }
            int last = -1;
            int temp = 0;
            for(int i = 1; i < n; i++){
                temp = (k + last)%link.size();
                link.remove(temp);
                last = (temp + link.size() - 1) % link.size();
                k += j;
            }
            System.out.println(link.get(0));
        }
    }
}