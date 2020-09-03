package algorithm.backjoon.$2009;

import java.util.Scanner;

//소수 구하기 
public class Sol1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt();
        int endNum = sc.nextInt();

        boolean[] isPrime = new boolean[endNum + 1];

        for (int i = 2; i <= endNum; i++) {
            if (!isPrime[i]) {
                for (int j = i + i; j <= endNum; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        for (int i = startNum; i <= endNum; i++) {
            if (i != 1) {
                if (!isPrime[i]) System.out.println(i);
            }
        }
    }
}
