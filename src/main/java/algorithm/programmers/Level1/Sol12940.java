package algorithm.programmers.Level1;

import java.util.Arrays;
//최소공배수 최대공약수
public class Sol12940 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(9999, 9998)));
    }

    public static long[] solution(int n, int m) {
        long[] answer = new long[2];

        int num1 = Math.max(n, m);
        int num2 = Math.min(n, m);
        int count = num2;

        answer[0] = 1;
        answer[1] = num1 * num2;
        System.out.println(Arrays.toString(answer));

        while (count > 1) {
            if (num1 % count == 0 && num2 % count == 0) {
                answer[0] = count;
                break;
            }
            count--;
        }

        answer[1] = n * m / answer[0];

        return answer;
    }
}
