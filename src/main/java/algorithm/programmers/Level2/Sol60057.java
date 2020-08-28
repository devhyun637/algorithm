package algorithm.programmers.Level2;

import java.util.Arrays;

//문자열 압축
public class Sol60057 {
    public static void main(String[] args) {
        String s = "aaabbbc";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        //길이가 1인경우 바로 리턴한다.
        if (s.length() == 1) return 1;

        int answer = s.length(), arrayLen, count = 0;
        int len = s.length();
        int[] findMin = new int[len / 2];

        for (int i = 0; i < len / 2; i++) {
            //문자열의 길
            count++;

            //글자수의 길이만큼 배열의 길이를 설정해준다.
            if (len % count != 0) arrayLen = len / count + 1;
            else arrayLen = len / count;
            String[] str = new String[arrayLen];


            //문자열을 자른다.
            int index = 0;
            for (int j = 0; j < str.length; j++) {
                //StringIndexOutOfBoundsException 방
                if (index + count > len) str[j] = s.substring(index, len);
                else str[j] = s.substring(index, index + count);
                index += count;
            }

//            System.out.println(Arrays.toString(str));

            int counting = 1;
            String newStr = "";
            for (int j = 0; j < str.length - 1; j++) {
                if (str[j].equals(str[j + 1])) {
                    counting++;
                } else {
                    if (counting != 1) newStr += counting + str[j];
                    else newStr += str[j];
                    counting = 1;
                }
            }
            if (counting != 1) newStr += counting + str[str.length - 1];
            else newStr += str[str.length - 1];

            findMin[i] = newStr.length();
//            answer = Math.min(newStr.length(), answer);
        }

        Arrays.sort(findMin);
        answer = findMin[0];

        return answer;
    }
}
