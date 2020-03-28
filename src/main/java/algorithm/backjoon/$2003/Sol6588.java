package algorithm.backjoon.$2003;

import java.util.Scanner;

//골드바흐의 추측
public class Sol6588 {
    public static void main(String[] args) {
        int MAX = 1000000;
        Scanner sc = new Scanner(System.in);

        //에라토스테네스의 체
        boolean[] isPrime = new boolean[MAX + 1];
        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i * i <= MAX; i++) {
            for (int j = i * 2; j <= MAX; j += i) {
                if (!isPrime[j]) isPrime[j] = true;
            }
        }

        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;

            for (int i = 2; i <= num; i++) {
                if (!isPrime[i] && !isPrime[num - i]) {
                    int b = num - i;
                    System.out.println(num + " = " + i + " + " + b);
                    break;
                }
                if (i == num) System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
}