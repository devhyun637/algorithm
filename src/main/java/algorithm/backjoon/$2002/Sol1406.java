package algorithm.backjoon.$2002;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/*
에디터
1. 기본 문자열을 입력받는다.
2. 문자열은 각각 글자별로 stack1에 넣는다.
3. 명령어를 몇개 받을지 입력받는다.
4. 명령어 수만큼 반복한다.
5. 명령어가 L 이라면?
          stack1의 크기가 0 인가? - continue;
          stack1 pop, stack2 push
   명령어가 D 라면?
          stack2의 크기가 0 인가? - continue;
          stack2 pop, stack1 push
   명령어가 B 라면?
          stack1의 크기가 0인가? - continue;
          stack1 pop
   명령어가 P 라면?
          입력받은 문자 stack1에 넣기
 6. stack1 + stack2 문자화하기
 */

public class Sol1406 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstStr = br.readLine();

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        for (int i = 0; i < firstStr.length(); i++) {
            left.push(firstStr.charAt(i));
        }

        int cmdNum = Integer.parseInt(br.readLine());

        while (cmdNum-- > 0) {
            String[] cmd = br.readLine().split(" ");

            switch (cmd[0]) {
                case "L":
                    if (left.size() == 0) break;
                    else right.push(left.pop());
                    break;

                case "D":
                    if (right.size() == 0) break;
                    else left.push(right.pop());
                    break;

                case "B":
                    if (left.size() == 0) break;
                    else left.pop();
                    break;

                case "P":
                    char ch = cmd[1].charAt(0);
                    left.push(ch);
                    break;
            }

        }

        while (!left.empty()) {
            right.push(left.pop());
        }
        StringBuilder answer = new StringBuilder();
        while (!right.empty()) {
            answer.append(right.pop());
        }
        System.out.println(answer);
    }
}



