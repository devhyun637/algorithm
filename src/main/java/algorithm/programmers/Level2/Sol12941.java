package algorithm.programmers.Level2;

import java.util.Arrays;

//최소값만들기 문제풀이
public class Sol12941 {
    public static void main(String[] args) {
        int[] A = {1, 2, 2};
        int[] B = {3, 4, 5};
        System.out.println(solution(A, B));

    }

    public static int solution(int[] A, int[] B) {
        int answer = 0;
        int len = A.length - 1;
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i <= len; i++) {
            answer += A[i] * B[len - i];
        }

        return answer;
    }
}
