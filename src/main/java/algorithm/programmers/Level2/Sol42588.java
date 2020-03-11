package algorithm.programmers.Level2;

import java.util.*;

//탑
public class Sol42588 {
    public static void main(String[] args) {
        int[] heights = {1, 5, 3, 6, 7, 6, 5};
        System.out.println(Arrays.toString(solution(heights)));
    }

    public static int[] solution(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[heights.length];

        for (int i = heights.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (heights[j] > heights[i]) {
                    stack.push(j + 1);
                    break;
                }
                if (j == 0) stack.push(0);
            }
        }
        stack.push(0);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
