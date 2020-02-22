package algorithm.backjoon;

import java.util.Scanner;

//카드 구매하기
public class Sol11052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int card = sc.nextInt() + 1;
        int[] price = new int[card];
        price[0] = 0;
        for (int i = 1; i < card; i++) {
            price[i] = sc.nextInt();
        }

        int[] d = new int[card];

        for (int i = 1; i < card; i++) {
            for (int j = 1; j <= i; j++) {
                d[i] = Math.max(d[i], price[j] + d[i - j]);
            }
        }
        System.out.println(d[card - 1]);
    }
}
