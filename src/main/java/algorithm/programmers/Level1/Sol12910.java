package algorithm.programmers.Level1;

import java.util.ArrayList;
import java.util.Arrays;

//나누어 떨어지는 숫자 배열
public class Sol12910 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 6};
        int divisor = 10;

        System.out.println(Arrays.toString(solution(arr, divisor)));
    }

    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int value : arr) {
            if (value % divisor == 0) list.add(value);
        }

        int[] answer = new int[list.size()];

        if (answer.length == 0) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);
        return answer;
    }
}



