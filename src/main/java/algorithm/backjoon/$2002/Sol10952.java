package algorithm.backjoon.$2002;

import java.util.Scanner;

public class Sol10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a + b != 0) {
            System.out.println(a + b);
            a = sc.nextInt();
            b = sc.nextInt();
        }
    }
}
