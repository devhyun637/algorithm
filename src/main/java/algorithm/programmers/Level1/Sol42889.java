package algorithm.programmers.Level1;

import java.util.*;

//실패율
public class Sol42889 {
    public static void main(String[] args) {
        int N = 4;
        int[] stages = {4, 4, 4, 4, 4};
        System.out.println(Arrays.toString(solution(N, stages)));
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer, Integer> clear = new HashMap<>();
        HashMap<Integer, Double> fail = new HashMap<>();

        for (int value : stages) {
            int count = clear.containsKey(value) ? clear.get(value) + 1 : 1;
            clear.put(value, count);
        }

        for (int i = 1; i <= N; i++) {
            if (!clear.containsKey(i)) clear.put(i, 0);
        }

        int people = stages.length;
        for (int i = 1; i <= N; i++) {
            fail.put(i, (double) (people - (people - clear.get(i))) / people);
            people -= clear.get(i);
        }

        ArrayList<Integer> failLate = new ArrayList<>(fail.keySet());
//        ArrayList<Integer> failLate = new ArrayList<>();
//        failLate.addAll(fail.keySet());

        for (int i = 0; i < failLate.size(); i++) {
            for (int j = i + 1; j < failLate.size(); j++) {
                if (fail.get(failLate.get(i)) < fail.get(failLate.get(j))) {
                    int tmp = failLate.get(i);
                    failLate.set(i, failLate.get(j));
                    failLate.set(j, tmp);
                }

                if (fail.get(failLate.get(i)).equals(fail.get(failLate.get(j)))) {
                    if (failLate.get(i) > failLate.get(j)) {
                        int tmp = failLate.get(i);
                        failLate.set(i, failLate.get(j));
                        failLate.set(j, tmp);
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            answer[i] = failLate.get(i);
        }

        return answer;
    }
}