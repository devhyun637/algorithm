package algorithm.backjoon.$2002;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

//쇠막대기
public class Sol10799 {
    public static void main(String[] args) throws Exception {
        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') stack.push('(');
            else {
                if (str.charAt(i-1) == ')') {
                    answer += 1;
                    stack.pop();
                } else {
                    stack.pop();
                    answer += stack.size();
                }
            }
        }

        System.out.println(answer);
    }
}
