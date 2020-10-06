package algorithm.programmers.Level2;

import java.util.Arrays;

//주식가격
public class Sol42584 {
    public static void main(String[] args) {
        int[] prices = {2, 2, 2, 2, 2, 2};
        System.out.println(Arrays.toString(solution(prices)));
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        answer[answer.length - 1] = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] > prices[j] || j == prices.length - 1) {
                    answer[i] = j - i;
                    break;
                }
            }
        }
        return answer;
    }
}
