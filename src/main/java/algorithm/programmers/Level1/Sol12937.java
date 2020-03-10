package algorithm.programmers.Level1;

//짝수와 홀수
public class Sol12937 {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    public static String solution(int num) {
        if (num == 0) return "Even";
        return num%2 == 0 ? "Even" : "Odd";
    }
}
