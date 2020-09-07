package algorithm.backjoon.$2009;

import java.util.Scanner;

//날짜 계산
public class Sol1476 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();

        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;

        int answer = 0;

        while (true) {
            if (firstNum++ == 15) firstNum = 1;
            if (secondNum++ == 28) secondNum = 1;
            if (thirdNum++ == 19) thirdNum = 1;
            answer++;
            if (firstNum == e && secondNum == s && thirdNum == m) break;
        }

        System.out.println(answer);
    }
}
