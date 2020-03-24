package algorithm.programmers.Level1;

import java.util.Arrays;

//자연수 뒤집어 배열로 만들기
public class Sol12932 {
    public static void main(String[] args) {
        long n = 123456;
        System.out.println(Arrays.toString(solution(n)));

    }

    public static int[] solution(long n) {
        String number = n + "";
        String[] ch = number.split("");
        int[] answer = new int[ch.length];
        int j = 0;

        for (int i = ch.length - 1; i >= 0; i--) {
            answer[j] = Integer.parseInt(ch[i]);
            j++;
        }

        return answer;
    }
}
