package algorithm.backjoon.$2002;

import java.util.Scanner;

public class Sol11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Case #" + (i + 1) + ": " + (sc.nextInt() + sc.nextInt()));
        }
    }
}
