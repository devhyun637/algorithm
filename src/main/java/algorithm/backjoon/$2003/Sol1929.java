package algorithm.backjoon.$2003;

import java.util.Scanner;

//소수구하기
public class Sol1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean[] isPrime = new boolean[n + 1];

        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i * i <= n; i++) {
            for (int j = i + i; j <= n; j += i) {
                if (isPrime[i]) break;
                else isPrime[j] = true;

            }
        }

        for (int i = m; i <= n; i++) {
            if(!isPrime[i]) System.out.println(i);
        }
    }
}
