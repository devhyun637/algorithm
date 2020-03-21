package algorithm.backjoon.$2003;

import java.util.Scanner;

//소수찾기
public class Sol1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int answer = 0;

        while (count-- > 0) {
            int num = sc.nextInt();
            boolean b = true;

            if (num == 1) b = false;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) answer++;
        }

        System.out.println(answer);
    }
}
