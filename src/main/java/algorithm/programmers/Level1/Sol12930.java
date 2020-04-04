package algorithm.programmers.Level1;

import java.util.Arrays;

//이상한 문자 만들기
public class Sol12930 {
    public static void main(String[] args) {
        String s = "sp  ace";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "";
        String[] arr = s.split("", -1);
        int length = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(" ")) length = 0;
            else {
                if (length % 2 == 0) arr[i] = arr[i].toUpperCase();
                else arr[i] = arr[i].toLowerCase();
                length++;
            }
            answer += arr[i];
        }

        return answer;
//        //방법2
//        String answer = "";
//        int count = 0;
//        String[] arr = s.split("");
//
//        for (String ss : arr) {
//            count = ss.contains(" ") ? 0 : count++;
//            answer += count % 2 == 0 ? ss.toUpperCase() : ss.toLowerCase();
//        }
//
//        return answer;
    }
}
