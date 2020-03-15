package algorithm.backjoon.$2002;

import java.util.Scanner;

public class Sol9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int number;

        while (count-- > 0){
            number = sc.nextInt();
            System.out.println(plusCount(number));
        }

    }

    public static int plusCount(int number) {
        int[] num = new int[100];
        num[0] = 1;
        num[1] = 1;
        num[2] = 2;

        for (int i = 3; i <= number; i++) {
            num[i] = num[i - 1] + num[i - 2] + num[i - 3];
        }

        return num[number];
    }
}
