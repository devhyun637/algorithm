package algorithm.programmers.Level1;

public class Sol12921 {
    public static void main(String[] args) {
        System.out.println(solution(10)); //4
    }

    public static int solution(int n) {
        int answer = 0;
        boolean[] isPrime = new boolean[n + 1];

        isPrime[0] = isPrime[1] = true;
        for (int i = 2; i * i <= n; i++) {
            for (int j = i * 2; j <= n; j += i) {
                if (!isPrime[j]) isPrime[j] = true;
            }
        }

        for (boolean b : isPrime) {
            if (!b) answer++;
        }
        return answer;
    }
}
