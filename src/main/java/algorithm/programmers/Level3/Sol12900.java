package algorithm.programmers.Level3;

//2xn 타일
public class Sol12900 {
    public static void main(String[] args) {
        System.out.println(solution(4));
    }

    public static int solution(int n) {
        int[] d = new int[66000];

        d[0] = 1;
        d[1] = 1;

        for (int i = 2; i <= n; i++) {
            d[i] = (d[i - 1] + d[i - 2]) % 1000000007;
        }

        return d[n];
    }
}
