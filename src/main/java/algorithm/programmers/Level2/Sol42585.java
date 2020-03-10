package algorithm.programmers.Level2;

import java.util.Stack;

public class Sol42585 {
    public static void main(String[] args){
        int answer = solution("()(((()())(())()))(())");
        System.out.println(answer);
    }

    public static int solution(String arrangement) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < arrangement.length(); i++) {
            if (arrangement.charAt(i) == '(') stack.push('(');
            else {
                stack.pop();
                if (arrangement.charAt(i-1) == ')') answer += 1;
                else answer += stack.size();
            }
        }
        return answer;
    }
}
