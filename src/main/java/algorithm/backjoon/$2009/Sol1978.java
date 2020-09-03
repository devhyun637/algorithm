package algorithm.backjoon.$2009;

import java.util.Scanner;

//소수 찾기
public class Sol1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        boolean[] isPrime = new boolean[1001];
        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i <= 1000; i++) {
            if (!isPrime[i]) {
                for (int j = i + i; j <= 1000; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        int count = sc.nextInt();
        while (count-- > 0) {
            int num = sc.nextInt();
            if (!isPrime[num]) answer++;
        }

        System.out.println(answer);
    }
}
