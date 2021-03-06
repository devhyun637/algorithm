package algorithm.backjoon.$2002;

/* 스택구현하기 - 라이브러리 없이
push X: 정수 X를 스택에 넣는 연산이다.
        pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        size: 스택에 들어있는 정수의 개수를 출력한다.
        empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
        top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */

import java.util.Scanner;

public class Sol10828_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        String cmd;
        int[] stack = new int[10000];
        int size = 0;

        while (count-- > 0) {
            cmd = sc.next();

            //push
            switch (cmd) {
                case "push":
                    stack[size++] = Integer.parseInt(sc.next());
                    break;

                //pop
                case "pop":
                    if (size < 1) System.out.println(-1);
                    else System.out.println(stack[--size]);
                    break;

                //size
                case "size":
                    System.out.println(size);
                    break;

                //empty
                case "empty":
                    if (size == 0) System.out.println(1);
                    else System.out.println(0);
                    break;

                //top
                case "top":
                    if (size < 1) System.out.println(-1);
                    else System.out.println(stack[(size - 1)]);
                    break;
            }
        }
    }
}
