package algorithm.programmers.Level2;

import java.util.Arrays;

//카펫
public class Sol42842 {
    public static void main(String[] args) {
        int brown = 8;
        int yellow = 1;
        System.out.println(Arrays.toString(solution(brown, yellow)));
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int width, height;

        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0 && yellow % (yellow / i) == 0) {
                width = yellow / i;
                height = i;
                if (((width + height) * 2 + 4) == brown) {
                    answer[0] = width + 2;
                    answer[1] = height + 2;
                    break;
                }
            }
        }

        return answer;
    }
}
