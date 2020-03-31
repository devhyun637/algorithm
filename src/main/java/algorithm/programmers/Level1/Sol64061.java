package algorithm.programmers.Level1;

import java.util.Stack;

//크레인 인형뽑기 게임
public class Sol64061 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            int num = move - 1;
            for (int j = 0; j < board.length; j++) {
                if (board[j][num] != 0) {
                    if (!stack.isEmpty() && board[j][num] == stack.peek()) {
                        stack.pop();
                        board[j][num] = 0;
                        answer += 2;
                        break;
                    } else {
                        stack.push(board[j][num]);
                        board[j][num] = 0;
                        break;
                    }
                }
            }
        }

        return answer;
    }
}
