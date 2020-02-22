package algorithm.backjoon;

import java.util.Scanner;

public class Sol16194 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int card = sc.nextInt() + 1;
        int[] price = new int[card - 1];
        int[] d = new int[card];
        d[0] = 0;

        for (int i = 0; i < card - 1; i++) {
            price[i] = sc.nextInt();
            d[i+1] = price[i];
        }

        for (int i = 1; i < card; i++) {
            for (int j = 1; j <= i; j++) {
                d[i] = Math.min(d[i], price[j - 1] + d[i - j]);
            }
        }
        System.out.println(d[card - 1]);
    }
}
