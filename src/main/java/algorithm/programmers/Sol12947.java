package algorithm.programmers;

public class Sol12947 {
    public static void main(String[] args) {
        System.out.println(solution(12));
    }

    public static boolean solution(int x) {
        int num = x;
        int sum = 0;

        while (num > 0) {
            sum += (num % 10);
            num = num / 10;
        }

        boolean answer = x % sum == 0;

        return answer;
    }
}
