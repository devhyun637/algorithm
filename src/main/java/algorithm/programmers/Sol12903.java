package algorithm.programmers;

public class Sol12903 {
    public static void main(String[] args) {
        System.out.println(solution("abcde"));
    }

    public static String solution(String s) {
        String answer = "";
        int count = s.length();

        if (count % 2 == 0) {
            answer = s.substring(count / 2 - 1, count / 2 + 1);
        } else {
            answer = s.charAt(count / 2) + "";
        }

        return answer;
    }
}
