package algorithm.programmers.Level2;

//타겟 넘버
public class Sol43165 {
    static int answer = 0;

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(solution(numbers, target));
    }

    public static int solution(int[] numbers, int target) {
        dfs(numbers, 0, 0, target);
        return answer;
    }

    public static int dfs(int[] numbers, int sum, int index, int target) {
        if (index == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return 0;
        }

        return dfs(numbers, sum + numbers[index], index + 1, target)
                + dfs(numbers, sum - numbers[index], index + 1, target);
    }

}
