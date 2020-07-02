package algorithm.programmers.Level2;

import java.util.Arrays;

//H-index
public class Sol42747 {
    public static void main(String[] args) {
        int[] citations = {0, 1, 3, 5, 5, 5, 5, 5, 5, 6};
        System.out.println(solution(citations));
    }

    public static int solution(int[] citations) {
        int answer = 0;
        int h;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            h = citations[i];
            if (h >= citations.length - i) {
                answer = citations.length - i;
                break;
            }
        }

        return answer;
    }
}
