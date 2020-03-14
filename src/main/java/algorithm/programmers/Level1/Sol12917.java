package algorithm.programmers.Level1;

//문자열 내림차순으로 배치하기

import java.util.Arrays;

public class Sol12917 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String[] str = s.split("");
        Arrays.sort(str);
        StringBuilder answer = new StringBuilder();

        for (int i = str.length - 1; i >= 0; i--) {
            answer.append(str[i]);
        }

        return answer.toString();
    }
}

