package algorithm.programmers.Level2;

//점프와 순간이동
public class Sol12980 {
    public static void main(String[] args) {
        int N = 5000;
        System.out.println(solution(N));
    }

    public static int solution(int n) {
        int ans = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                ans++;
                n -= 1;
            }
        }

        return ans;
    }
}
