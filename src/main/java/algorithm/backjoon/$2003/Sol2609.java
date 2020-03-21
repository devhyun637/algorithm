package algorithm.backjoon.$2003;

import java.util.Scanner;

//최대공약수 최소공배수
//유클리드 호제법 증명 : https://www.youtube.com/watch?v=J5Yl2kHPAY4
public class Sol2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = gcd(a, b);
        System.out.println(gcd);

        int lcm = a * b / gcd;
        System.out.println(lcm);

    }

    public static int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            int tmp = a;
            a = b;
            b = tmp % b;
        }

        return a;
    }
}
