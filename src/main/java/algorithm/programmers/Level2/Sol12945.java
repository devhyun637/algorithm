package algorithm.programmers.Level2;

//피보나치 수
public class Sol12945 {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    public static int solution(int n) {
        int[] f = new int[100099];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            f[i] = (f[i - 1] + f[i - 2]) % 1234567;
        }

        return f[n];
    }
}
