package algorithm.programmers.Level1;

//문자열 다루기 기본
public class Sol12918 {
    public static void main(String[] args) {
        System.out.println(solution("1234aaa"));
    }

    public static boolean solution(String s) {
        boolean answer = true;
        if (s.length() != 4 && s.length() != 6) return false;

        String[] str = s.split("");

        try {
            for (String string : str) {
                Integer.parseInt(string);
            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
            answer = false;
        }
        return answer;
    }
}