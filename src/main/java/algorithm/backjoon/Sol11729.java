package algorithm.backjoon;

import java.util.Scanner;

//2xn 타일 1
public class Sol11729 {
    public static void main(String[] args) {
        //끝이 세로가 오는 경우, 끝이 가로가 오는 경우를 생각해서 점화식 세우기
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] d = new int[100000];

        d[0] = 1;
        d[1] = 1;
        for (int i = 2; i <= num; i++) {
            d[i] = d[i - 1] + d[i - 2];
            d[i] = d[i]%10007;
        }

        System.out.println(d[num]);
    }
}
