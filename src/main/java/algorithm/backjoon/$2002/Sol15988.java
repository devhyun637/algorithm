package algorithm.backjoon.$2002;

import java.util.Scanner;

//1,2,3 더하기 3
public class Sol15988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int number;

        while (count-- > 0) {
            number = sc.nextInt();
            System.out.println(plusCount(number));
        }

    }

    public static long plusCount(int number) {
        long[] num = new long[1999999];
        num[0] = 1;
        num[1] = 1;
        num[2] = 2;

        for (int i = 3; i <= number; i++) {
            num[i] = (num[i - 1] + num[i - 2] + num[i - 3]) % 1000000009;
        }

        return num[number];
    }
}
