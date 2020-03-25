package algorithm.backjoon.$2003;

import java.util.Scanner;

//골드바흐의 추측
public class Sol6588 {
    public static void main(String[] args) {
        int MAX = 10000001;
        Scanner sc = new Scanner(System.in);

        boolean[] isPrime = new boolean[MAX];

        isPrime[0] = isPrime[1] = true;
        for (int i = 2; i * i < MAX; i++) {
            for (int j = i * i; j < MAX; j += i) {
                if (isPrime[i]) break;
                else {
                    isPrime[j] = true;
                }
            }
        }

        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;
            for (int i = 1; i <= num; i++) {
                if (!isPrime[i] && !isPrime[num - i]) {
                    System.out.println(num + " = " + i + " + " + (num - i));
                    break;
                }
            }
        }
    }
}
