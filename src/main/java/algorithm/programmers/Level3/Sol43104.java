package algorithm.programmers.Level3;

//타일 장식물
public class Sol43104 {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    public static long solution(int N) {
        long answer = 0;
        long[] arr = new long[N + 2];
        arr[0] = arr[1] = 1;

        for (int i = 2; i < N + 2; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        answer = 2 * arr[N + 1];

        return answer;
    }
}
