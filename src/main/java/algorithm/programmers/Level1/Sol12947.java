package algorithm.programmers.Level1;

//하샤드
public class Sol12947 {
    public static void main(String[] args) {
        System.out.println(solution(12));
    }

    public static boolean solution(int x) {
        int num = x;
        int sum = 0;

        while (num > 0) {
           sum += num % 10;
           num = num / 10;
        }
        System.out.println(sum);
        System.out.println(x);

        return x % sum == 0;
    }
}
