package algorithm.samsung;

import java.util.Scanner;

public class Sol2070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int a, b;
        String answer;

        for (int i = 0; i < count; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a > b) answer = ">";
            else if (a == b) answer = "=";
            else answer = "<";

            System.out.println("#" + (i + 1) + " " + answer);
        }
    }
}

