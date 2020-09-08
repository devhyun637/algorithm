package algorithm.programmers.Level1;

import java.util.Arrays;
import java.util.HashMap;

//실패율_2
public class Sol42889_2 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution(N, stages)));
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] stage = new int[N + 2];
        HashMap<Integer, Double> hs = new HashMap<>();
        int sum = stages.length;

        //각 스테이지 별 실패한 사람 수 세기
        for (int i : stages) stage[i]++;
        // System.out.println(Arrays.toString(stage));

        //각 스테이지 별 실패율 계산하기
        for (int i = 1; i < stage.length - 1; i++) {
            hs.put(i, (double)stage[i]/sum);
            sum = sum - stage[i];
        }

        //실패율 순서대로 정렬하기
        for (int i = 1; i <= hs.size(); i++) {
            double max = hs.get(i);
            int index  = i;
            answer[i - 1] = i;

            for (int j = 1; j <= hs.size(); j++) {
                if (max < hs.get(j)) {
                    max = hs.get(j);
                    index = j;
                    answer[i - 1] = j;
                }

                if (i != j && max == hs.get(j)) {
                    if (index < j) continue;
                    else {
                        index = j;
                        answer[i - 1] = j;
                    }
                }
            }
            hs.put(index, -100.0);
        }

        return answer;
    }
}
