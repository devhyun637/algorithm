package algorithm.backjoon.$2002;

import java.util.Scanner;
import java.lang.Integer;

public class Sol10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num-- > 0) {
            String[] cal = sc.next().split(",");
            System.out.println(Integer.parseInt(cal[0]) + Integer.parseInt(cal[1]));
        }
    }
}
