package algorithm.programmers.Level1;

import java.util.*;

//두 개 뽑아서 더하기
public class Sol68644 {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        System.out.println(Arrays.toString(solution(numbers)));
    }

    public static int[] solution(int[] numbers) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                hashSet.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[hashSet.size()];
        int i = 0;

        for (Integer integer : hashSet) {
            answer[i++] = integer;
        }

        Arrays.sort(answer);
        return answer;
    }
}