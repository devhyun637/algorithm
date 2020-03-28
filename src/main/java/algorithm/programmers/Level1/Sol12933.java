package algorithm.programmers.Level1;

import java.util.Arrays;

//정수 내림차순으로 배치하기
public class Sol12933 {
    public static void main(String[] args) {
        long n = 79998881;
        System.out.println(solution(n));
    }

    public static long solution(long n) {
        long answer = 0;
        String number = n + "";
        String[] str = number.split("");
        int[] arr = new int[number.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            answer += arr[i] * Math.pow(10, i);
        }

        return answer;
    }
}
