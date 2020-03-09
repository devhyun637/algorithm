package algorithm.programmers.Level1;

//수박수박수박수
public class Sol12922 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static String solution(int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            answer += i % 2 == 0 ? "수" : "박";
        }

        return answer;
    }
}
