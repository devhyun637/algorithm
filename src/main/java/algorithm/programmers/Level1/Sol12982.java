package algorithm.programmers.Level1;

//예산 문제풀이
import java.util.Arrays;

public class Sol12982 {
    public static void main(String[] args) {
        int[] d = {2, 2, 3, 3};
        int budget = 10;
        System.out.println(solution(d, budget));
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int value : d) {
            if (budget - value >= 0) {
                budget = budget - value;
                answer++;
            }
        }

        return answer;
    }
}
