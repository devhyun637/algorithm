package algorithm.backjoon.$2002;

import java.util.Scanner;

public class Sol10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[sc.nextInt()];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        int min = num[0];
        int max = num[0];

        for (int value : num) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        System.out.println(min+ " " + max);
    }
}