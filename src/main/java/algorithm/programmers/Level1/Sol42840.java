package algorithm.programmers.Level1;

import java.util.ArrayList;
import java.util.Arrays;

//모의고사
public class Sol42840 {
    public static void main(String[] args) {
        int[] answer = {2, 1, 2, 3, 2, 4, 2, 5};
        System.out.println(Arrays.toString(solution(answer)));
    }

    public static int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] sum = new int[3];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % 5]) sum[0]++;
            if (answers[i] == p2[i % 8]) sum[1]++;
            if (answers[i] == p3[i % 10]) sum[2]++;
        }

        int max = sum[0];
        for (int value : sum) {
            if (max < value) max = value;
        }

        for (int i = 0; i < sum.length; i++) {
            if (max == sum[i]) list.add(i + 1);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
