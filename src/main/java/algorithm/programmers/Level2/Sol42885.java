package algorithm.programmers.Level2;

import java.util.ArrayList;
import java.util.Arrays;

//구명보트
public class Sol42885 {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        System.out.println(solution(people, limit));
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        Arrays.sort(people);
        for (int i : people) {
            arrayList.add(i);
        }

        while (arrayList.size() > 1) {
            if (arrayList.get(arrayList.size() - 1) + arrayList.get(0) <= limit) {
                arrayList.remove(0);
            }
            arrayList.remove(arrayList.size() - 1);
            answer++;
        }

        if (arrayList.size() != 0) {
            answer++;
        }
        return answer;
    }
}

