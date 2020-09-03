package algorithm.backjoon.$2009;

import java.util.Scanner;

//골드바흐의 추측
public class Sol6588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] isPrime = new boolean[1000001];
        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i <= 1000000; i++) {
            if (!isPrime[i]) {
                for (int j = i + i; j <= 1000000; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;
            else {
                for (int i = num - 1; i > 0; i--) {

                    if (i == 1) {
                        System.out.println("Goldbach's conjecture is wrong.");
                        break;
                    }

                    if (i % 2 == 1 && (num - i) % 2 == 1 && !isPrime[i] && !isPrime[num - i]) {
                        System.out.println(num + " = " + (num - i) + " + " + i);
                        break;
                    }
                }
            }
        }
    }
}
