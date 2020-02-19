package algorithm.programmers;

public class Sol43104 {
    public static void main(String[] args) {
        System.out.println(solution(80));
    }

    public static long solution(int N) {
        long answer;
        long[] d = new long[100];

        d[0] = 1;
        d[1] = 1;

        for (int i = 2; i <= N + 1; i++) {
            d[i] = d[i - 1] + d[i - 2];
        }

        answer = (d[N] + d[N - 1]) * 2;
        return answer;
    }
}
