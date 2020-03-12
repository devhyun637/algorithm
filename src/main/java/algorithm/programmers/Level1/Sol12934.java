package algorithm.programmers.Level1;

//정수 제곱근 판별하기
public class Sol12934 {
    public static void main(String[] args) {
        System.out.println(solution(121));
        System.out.println(solution(1));
        System.out.println(solution(133));
    }

    public static long solution(long n) {

        for (long i = (long) Math.sqrt(n); i > 0; i--) {
            if (i * i == n) return (i + 1) * (i + 1);
        }

        return -1;
    }
}
