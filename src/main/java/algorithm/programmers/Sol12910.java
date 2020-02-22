package algorithm.programmers;

import java.util.Arrays;
import java.util.Stack;

//나누어 떨어지는 숫자 배열
public class Sol12910 {
    public static void main(String[] args) {
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;

        System.out.println(Arrays.toString(solution(arr, divisor)));
    }

    public static int[] solution(int[] arr, int divisor) {
        Stack<Integer> stack = new Stack<>();
        int[] answer;
        for (int value : arr) {
            if (value % divisor == 0) stack.push(value);
        }

        if (stack.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[stack.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = stack.pop();
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
//    public static void main(String[] args) {
//        int[] arr = {2, 36, 1, 3};
//        int divisor = 1;
//
//        int[] answer = divisoion(arr, divisor);
//        Arrays.sort(answer);
//        for (int value : answer) System.out.println(value);
//    }
//    public static int[] divisoion(int[] arr, int divisor) {
//        return Arrays.stream(arr).filter(number -> number % divisor == 0).toArray();
//    }

