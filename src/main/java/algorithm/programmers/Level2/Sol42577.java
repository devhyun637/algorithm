package algorithm.programmers.Level2;

import java.util.Arrays;
import java.util.Comparator;

//전화번호 목록
public class Sol42577 {
    public static void main(String[] args) {
        String[] str = {"123", "456", "789"};
        System.out.println(solution(str));
    }

    public static boolean solution(String[] phone_book) {

        Arrays.sort(phone_book, Comparator.comparingInt(String::length));

//        Arrays.sort(phone_book, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(), o2.length());
//            }
//        });

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                if (phone_book[j].startsWith(phone_book[i])) {
                    return false;
                }
            }
        }

        return true;
    }
}
