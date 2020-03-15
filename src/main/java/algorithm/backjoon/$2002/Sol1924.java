package algorithm.backjoon.$2002;

import java.util.Scanner;

public class Sol1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        for (int i = 0; i < firstNum - 1; i++) {
            secondNum += month[i];
        }

        System.out.println(day[secondNum % 7]);
    }
}
