package algorithm.programmers;

public class Sol12943 {
    public static void main(String[] args) {
        System.out.println(solution(626331));
    }

    public static int solution(int num) {
        int answer = 0;
        long sum = num;

        while (sum != 1) {
            sum = (sum % 2 == 0) ? sum / 2 : (sum * 3 + 1);
            answer += 1;

            if (answer == 500) return -1;
        }

        return answer;
    }
}
