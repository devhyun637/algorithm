package algorithm.backjoon.$2002;

//괄호

import java.util.Scanner;
import java.util.Stack;

public class Sol9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        while (count-- > 0) {
            System.out.println(psvTest(sc.next()));
        }

    }

    public static String psvTest(String str) {
        //1. 시작 문자가 ')'이라면 바로 NO를 리턴한다.
        //2. 시작 문자가 '('이라면 stack에 push하고, ')'이라면 pop한다.
        //   stack의 사이즈가 0이라면 NO를 리턴한다.
        //   문자열을 다 돌았는데 stack의 사이즈가 0이라면 NO를 리턴한다.
        String answer = "NO";
        int count = str.length();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < count; i++) {
            if (str.charAt(0) == ')') return answer;
            else {
                if (str.charAt(i) == '(') stack.push(1);
                else {
                    if (stack.size() == 0) return answer;
                    else stack.pop();
                }
            }
        }

        if (stack.size() == 0) answer = "YES";
        return answer;
    }
}
