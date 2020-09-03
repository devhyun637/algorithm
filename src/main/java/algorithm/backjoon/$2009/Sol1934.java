package algorithm.backjoon.$2009;

import java.util.Scanner;

//최소공배수
public class Sol1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int minNum = Math.min(a, b);
            int maxNum = Math.max(a, b);
            int r = -1;

            if (maxNum % minNum == 0) maxNum = minNum;
            while (r != 0) {
                r = maxNum % minNum;
                maxNum = minNum;
                minNum = r;
            }

            System.out.println(a * b / maxNum);
        }
    }
}
