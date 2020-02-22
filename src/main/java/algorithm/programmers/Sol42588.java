package algorithm.programmers;

import java.util.Arrays;

//탑
public class Sol42588 {
    public static void main(String[] args) {
        int[] heights = {1, 5, 3, 6, 7, 6, 5};
        System.out.println(Arrays.toString(solution(heights)));
    }

    public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < i; j++) {
                if (heights[j] > heights[i]) answer[i] = j + 1;
            }
        }

        return answer;
    }
}
