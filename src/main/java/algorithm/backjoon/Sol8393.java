package algorithm.backjoon;

import java.util.Scanner;

public class Sol8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int totalSum = 0;

        while (num > 0) {
            totalSum += num;
            num--;
        }

        System.out.println(totalSum);
    }
}
