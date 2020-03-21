package algorithm.backjoon.$2003;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//gcd의 합
public class Sol9613 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());


        while (count-- > 0) {
            long answer = 0;
            String[] str = br.readLine().split(" ");
            int num = Integer.parseInt(str[0]);

            for (int i = 1; i <= num; i++) {
                for (int j = i + 1; j <= num; j++) {
                    int a = Integer.parseInt(str[i]);
                    int b = Integer.parseInt(str[j]);
                    answer += gcd(a, b);
                }
            }
            System.out.println(answer);
        }
    }

    public static int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            int tmp = a;
            a = b;
            b = tmp % b;
        }

        return a;
    }
}
