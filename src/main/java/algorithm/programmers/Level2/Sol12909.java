package algorithm.programmers.Level2;

import java.util.Stack;

//괄호
public class Sol12909 {
    public static void main(String[] args) {
        String question = "(()()))))";
        System.out.println(solution(question));
    }

    public static boolean solution(String s) {
        boolean answer = false;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            //정상적인 흐름
            if (s.charAt(i) == '(') {
                stack.push(1);
            } else {
                if (stack.empty()) return false;
                else stack.pop();
            }

        }

        if (stack.empty()) answer = true;
        return answer;
    }
}
