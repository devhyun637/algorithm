package algorithm.backjoon.$2002;

//카드 구매하기2
import java.util.Scanner;

public class Sol16194 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int card = sc.nextInt() + 1;
        int[] price = new int[card];

        for (int i = 1; i < card; i++) {
            price[i] = sc.nextInt();
        }
        int[] d = price;

        for (int i = 1; i < card; i++) {
            for (int j = 1; j <= i; j++) {
                d[i] = Math.min(d[i], price[j] + d[i - j]);
            }
        }
        System.out.println(d[card - 1]);
    }
}
