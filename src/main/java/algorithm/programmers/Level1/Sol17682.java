package algorithm.programmers.Level1;

import java.util.Stack;

//다트게임
public class Sol17682 {
    public static void main(String[] args) {
        String str = "5S#10S*2D*";
        System.out.println(solution(str));
    }

    public static int solution(String dartResult) {
        int answer = 0;
        String[] strings = dartResult.split("");
        Stack<Integer> stack = new Stack<>();
        int num1, num2;

        for (int i = 0; i < strings.length; i++) {
            String order = strings[i];

            //보너스
            switch (order) {
                //보너스
                case "S":
                    break;
                case "D":
                    stack.push((int) Math.pow(stack.pop(), 2));
                    break;
                case "T":
                    stack.push((int) Math.pow(stack.pop(), 3));
                    break;

                //옵션1
                case "*":
                    if (stack.size() > 1) {
                        num1 = stack.pop() * 2;
                        num2 = stack.pop() * 2;
                        stack.push(num2);
                        stack.push(num1);
                    } else {
                        num1 = stack.pop() * 2;
                        stack.push(num1);
                    }
                    break;

                //옵션2
                case "#":
                    num1 = stack.pop() * (-1);
                    stack.push(num1);
                    break;

                //숫자
                default:
                    if (order.equals("0")) {
                        if (i != 0 && strings[i - 1].equals("1")) {
                            stack.pop();
                            stack.push(10);
                        } else stack.push(0);
                    } else stack.push(Integer.parseInt(order));
                    break;
            }
        }

        while (!stack.empty()) {
            answer += stack.pop();
        }
        return answer;
    }
}
