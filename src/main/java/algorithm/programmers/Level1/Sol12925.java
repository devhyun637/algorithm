package algorithm.programmers.Level1;

public class Sol12925 {
    public static void main(String[] args) {
        System.out.println(solution("-12345"));
    }

    public static int solution(String s) {
        char[] ch = s.toCharArray();
        int answer;

        if (ch[0] == '-') {
            String str = String.valueOf(ch, 1, s.length() - 1);
            answer = Integer.parseInt(str) * -1;
        } else {
            String str = String.valueOf(ch);
            answer = Integer.parseInt(str);
        }

        return answer;
    }
}
