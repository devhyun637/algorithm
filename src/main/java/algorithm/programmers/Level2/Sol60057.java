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

        int answer, arrayLen, count = 0;
        int len = s.length();
        int[] findMin = new int[len / 2];

        for (int i = 0; i < len / 2; i++) {
            //문자의 길이
            count++;

            //글자수의 길이만큼 배열의 크기를 설정해준다.
            if (len % count != 0) arrayLen = len / count + 1;
            else arrayLen = len / count;
            String[] strArray = new String[arrayLen];


            //문자열을 자른다.
            int index = 0;
            for (int j = 0; j < strArray.length; j++) {
                //StringIndexOutOfBoundsException 오류 방지
                if (index + count > len) strArray[j] = s.substring(index, len);
                else strArray[j] = s.substring(index, index + count);
                index += count;
            }

//            System.out.println(Arrays.toString(strArray));

            int counting = 1;
            String newStr = "";
            for (int j = 0; j < strArray.length - 1; j++) {
                if (strArray[j].equals(strArray[j + 1])) {
                    counting++;
                } else {
                    if (counting != 1) newStr += counting + strArray[j];
                    else newStr += strArray[j];
                    counting = 1;
                }
            }

            if (counting != 1) newStr += counting + strArray[strArray.length - 1];
            else newStr += strArray[strArray.length - 1];

            findMin[i] = newStr.length();
        }

        Arrays.sort(findMin);
        answer = findMin[0];

        return answer;
    }
}
