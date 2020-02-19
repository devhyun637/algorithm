package algorithm.programmers;

//2xn 타일
public class Sol12900 {
    public static void main(String[] args) {
        System.out.println(solution(4));
    }

    public static int solution(int n) {
        int answer;
        // 1. 한개만들 때 : 1개
        // 2. 2개로 만들 때 : 2개
        int[] d = new int[60000];
        d[1] = 1;
        d[2] = 2;

        for (int i = 3; i <= n; i++) {
            d[i] = d[i - 1] + d[i - 2];
            d[i] = d[i] % 1000000007;
        }

        answer = d[n];
        return answer;
    }

}
