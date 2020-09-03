package algorithm.backjoon.$2009;

import java.util.Scanner;

//최대공약수와 최소공배수
public class Sol2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int num1 = Math.max(a, b);
        int num2 = Math.min(a, b);
        int r = num2;

        if (num1 % num2 == 0) num1 = num2;
        else {
            while (r != 0) {
                r = num1 % num2;
                num1 = num2;
                num2 = r;
            }
        }

        System.out.println(num1);
        System.out.println(a * b / num1);
    }
}
