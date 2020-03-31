package algorithm.programmers.Level1;

import java.util.Arrays;

//체육복
public class Sol42862 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reverse = {2};
        System.out.println(solution(n, lost, reverse));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] count = new int[n];

        //배열 값 초기화
        Arrays.fill(count, 1);

        for (int element : lost) {
            count[element - 1] = 0;
        }

        for (int item : reserve) {
            count[item - 1]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) {
                if (i == 0) {
                    if (count[1] == 2) {
                        count[0]++;
                        count[1]--;
                    }
                } else if (i == count.length - 1) {
                    if (count[i - 1] == 2) {
                        count[i]++;
                        count[i - 1]--;
                    }
                } else {
                    if (count[i - 1] == 2) {
                        count[i - 1]--;
                        count[i]++;
                    }
                    if (count[i + 1] == 2) {
                        count[i + 1]--;
                        count[i]++;
                    }
                }
            }
        }

        for (int value : count) {
            if (value != 0) answer++;
        }

        return answer;
    }
}
