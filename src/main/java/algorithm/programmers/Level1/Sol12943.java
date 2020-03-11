package algorithm.programmers.Level1;

//콜라츠추측
public class Sol12943 {
    public static void main(String[] args) {
        System.out.println(solution(16));
    }

    public static int solution(int num) {
        long collatz = num;
        int count = 0;

        while (count < 500) {
            if (collatz == 1) break;
            else {
                collatz = collatz % 2 == 0 ? collatz / 2 : collatz * 3 + 1;
                count++;
            }
        }

        if (count >= 500) return -1;
        return count;
    }
}
