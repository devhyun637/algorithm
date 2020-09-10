package algorithm.programmers.Level2;

import java.util.Stack;

//수식 최대화
public class Sol67257 {
    public static void main(String[] args) {
        String expression = "500*5-300-300+900";
        System.out.println(solution(expression));
    }

    public static long solution(String expression) {
        long answer = 0;
        Stack<String> stack = new Stack<>();
        long max;

        String[] str = expression.split("");
        String string = "";
        for (String s : str) {
            switch (s) {
                case "+":
                case "*":
                case "-":
                    if (!string.equals("")) {
                        stack.push(string);
                        string = "";
                    }
                    stack.push(s);
                    break;
                default:
                    string += s;
                    break;
            }
        }
        stack.push(string);

        // * - +
        max = calculation(makeStack(makeStack(stack, "*"), "-"), "+");
        if (max < 0) max = max * (-1);
        answer = Math.max(max, answer);

        // * + -
        max = calculation(makeStack(makeStack(stack, "*"), "+"), "-");
        if (max < 0) max = max * (-1);
        answer = Math.max(max, answer);

        // + * -
        max = calculation(makeStack(makeStack(stack, "+"), "*"), "-");
        if (max < 0) max = max * (-1);
        answer = Math.max(max, answer);

        // + - *
        max = calculation(makeStack(makeStack(stack, "+"), "-"), "*");
        if (max < 0) max = max * (-1);
        answer = Math.max(max, answer);

        // - + *
        max = calculation(makeStack(makeStack(stack, "-"), "+"), "*");
        if (max < 0) max = max * (-1);
        answer = Math.max(max, answer);

        // - * +
        max = calculation(makeStack(makeStack(stack, "-"), "*"), "+");
        if (max < 0) max = max * (-1);
        answer = Math.max(max, answer);

        return answer;
    }

    public static Stack<String> makeStack(Stack<String> stack, String calculate) {
        Stack<String> answer = new Stack<>();
        Stack<String> newStack = new Stack<>();
        for (String s : stack) newStack.push(s);

        Stack<String> calStack = new Stack<>();
        while (!newStack.isEmpty()) calStack.push(newStack.pop());


        long number;
        answer.push(calStack.pop());

        while (!calStack.isEmpty()) {

            if (calStack.peek().equals(calculate)) {
                calStack.pop();
                switch (calculate) {
                    case "+":
                        number = Long.parseLong(answer.pop()) + Long.parseLong(calStack.pop());
                        answer.push(number + "");
                        break;
                    case "*":
                        number = Long.parseLong(answer.pop()) * Long.parseLong(calStack.pop());
                        answer.push(number + "");
                        break;
                    case "-":
                        number = Long.parseLong(answer.pop()) - Long.parseLong(calStack.pop());
                        answer.push(number + "");
                        break;
                }
            } else {
                answer.push(calStack.pop());
            }
        }

        return answer;
    }

    public static long calculation(Stack<String> stack, String calculate) {
        Stack<String> calStack = new Stack<>();
        while (!stack.isEmpty()) calStack.push(stack.pop());

        long number = Long.parseLong(calStack.pop());

        while (!calStack.isEmpty()) {

            if (calStack.peek().equals(calculate)) {
                calStack.pop();
                switch (calculate) {
                    case "+":
                        number = number + Long.parseLong(calStack.pop());
                        break;
                    case "*":
                        number = number * Long.parseLong(calStack.pop());
                        break;
                    case "-":
                        number = number - Long.parseLong(calStack.pop());
                        break;
                }
            }
        }

        return number;
    }
}
