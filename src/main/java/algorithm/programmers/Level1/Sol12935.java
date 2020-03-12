package algorithm.programmers.Level1;

import java.util.Arrays;

//제일 작은 수 제거하기
public class Sol12935 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 78, 3, 6, 8, 10};
        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr2);

        int[] answer = new int[arr.length - 1];

        int min = arr2[0];
        int count = 0;

        for (int i : arr) {
            if (i != min) {
                answer[count] = i;
                count++;
            }
        }

        return answer;
    }
}
