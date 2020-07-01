package algorithm.programmers.Level2;

import java.util.Stack;

//짝지어 제거하기
public class Sol12973 {
    public static void main(String[] args) {
        String s = "aaabbbccc";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (!stack.empty() && s.charAt(i) == stack.peek()) stack.pop();
            else stack.push(s.charAt(i));
        }

        if (stack.empty()) answer = 1;

        return answer;
    }
}
