package algorithm.backjoon;

import java.util.Scanner;

//알파벳 개수
public class Sol10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().trim();
        int[] count = new int[100];
        int strNum;
        for (int i = 0; i < str.length(); i++) {
            strNum = str.charAt(i);
            count[(strNum - 97)] += 1;
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(count[i] + " ");
        }
    }
}
