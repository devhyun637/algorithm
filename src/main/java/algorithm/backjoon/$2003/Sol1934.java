package algorithm.backjoon.$2003;

import java.util.Scanner;

//최소공배수
public class Sol1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int a, b, lcm;

        while (count-- > 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            lcm = a * b / gcd(a, b);
            System.out.println(lcm);
        }
    }

    public static int gcd(int a, int b) {
        int tmp;

        while (a != 0 && b != 0) {
            tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
}
