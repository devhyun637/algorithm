package algorithm.backjoon.$2009;

import java.util.Scanner;

//에라토스테네스의 체
public class Sol2960 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;

        boolean[] isPrime = new boolean[N + 1];
        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i <= N; i++) {
            if (!isPrime[i]) {
                count++;
                if (count == K) System.out.println(i);

                for (int j = i + i; j <= N; j += i) {
                    if (!isPrime[j]) {
                        count++;
                        isPrime[j] = true;
                        if (count == K) System.out.println(j);
                    }
                }
            }
        }
    }
}
