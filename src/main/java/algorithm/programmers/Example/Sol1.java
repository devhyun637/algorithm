package algorithm.programmers.Example;

import java.util.Arrays;
import java.util.HashMap;

//나머지 한 점
public class Sol1 {
    public static void main(String[] args) {
        int[][] v = {{1, 5}, {8, 5}, {8, 10}};
        System.out.println(Arrays.toString(solution(v)));
    }

    public static int[] solution(int[][] v) {
        int[] answer = new int[2];
        HashMap<Integer, Integer> hs1 = new HashMap<>();
        HashMap<Integer, Integer> hs2 = new HashMap<>();

        for (int[] ints : v) {
            hs1.put(ints[0], hs1.getOrDefault(ints[0], 0) + 1);
            hs2.put(ints[1], hs2.getOrDefault(ints[1], 0) + 1);
        }

        for (int i : hs1.keySet()) {
            if(hs1.get(i) == 1) answer[0] = i;
        }

        for (int i : hs2.keySet()) {
            if(hs2.get(i) == 1) answer[1] = i;
        }

        return answer;
    }
}

