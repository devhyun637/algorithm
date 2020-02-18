package algorithm.backjoon;

import java.util.Scanner;
import java.util.Stack;

//막대기
public class Sol17608 {
    public static void main(String[] args) {
        int answer = 1;
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < count; i++) {
            stack.push(sc.nextInt());
        }

        int max = stack.pop();
        for (int i = 0; i < count - 1; i++) {
            if (stack.peek() > max) {
                max = stack.pop();
                answer++;
            } else stack.pop();
        }

        System.out.println(answer);
    }
}
