package algorithm.programmers.Level1;

//핸드폰번호 가리기
public class Sol12948 {
    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
    }

    public static String solution(String phone_number) {
        String answer = "";
        char[] ch = phone_number.toCharArray();

        for (int i = 0; i < ch.length - 4; i++) {
            ch[i] = '*';
        }

        return String.valueOf(ch);
    }
}
