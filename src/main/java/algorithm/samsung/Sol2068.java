package algorithm.samsung;

import java.util.Scanner;

public class Sol2068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int max = -1;
        int num;

        for (int j = 0; j < count; j++) {
            for (int i = 0; i < 10; i++) {
                num = sc.nextInt();
                max = Math.max(max, num);
            }
            System.out.println("#" + (j + 1) + " " + max);
            max = 0;
        }
    }
}
