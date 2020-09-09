package algorithm.programmers.Level2;

//키패드 누르기
public class Sol67256 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";
        System.out.println(solution(numbers, hand));
    }

    public static String solution(int[] numbers, String hand) {
        String answer = "";
        int left1 = 3;
        int left2 = 0;
        int right1 = 3;
        int right2 = 2;
        int move1;
        int move2;

//        int[][] keyBoard = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-10, 0, -10}};

        for (int i : numbers) {
            switch (i) {
                case 1:
                    left1 = 0;
                    left2 = 0;
                    answer += "L";
                    break;

                case 2:
                    move1 = 0;
                    move2 = 1;

                    if (Math.abs(move1 - left1) + Math.abs(move2 - left2) < Math.abs(move1 - right1) + Math.abs(move2 - right2)) {
                        answer += "L";
                        left1 = 0;
                        left2 = 1;
                    } else if (Math.abs(move1 - left1) + Math.abs(move2 - left2) > Math.abs(move1 - right1) + Math.abs(move2 - right2)) {
                        answer += "R";
                        right1 = 0;
                        right2 = 1;
                    } else {
                        if (hand.equals("left")) {
                            answer += "L";
                            left1 = 0;
                            left2 = 1;
                        } else {
                            answer += "R";
                            right1 = 0;
                            right2 = 1;
                        }
                    }

                    break;

                case 3:
                    right1 = 0;
                    right2 = 2;
                    answer += "R";
                    break;

                case 4:
                    left1 = 1;
                    left2 = 0;
                    answer += "L";
                    break;

                case 5:
                    move1 = 1;
                    move2 = 1;

                    if (Math.abs(move1 - left1) + Math.abs(move2 - left2) < Math.abs(move1 - right1) + Math.abs(move2 - right2)) {
                        answer += "L";
                        left1 = 1;
                        left2 = 1;
                    } else if (Math.abs(move1 - left1) + Math.abs(move2 - left2) > Math.abs(move1 - right1) + Math.abs(move2 - right2)) {
                        answer += "R";
                        right1 = 1;
                        right2 = 1;
                    } else {
                        if (hand.equals("left")) {
                            answer += "L";
                            left1 = 1;
                            left2 = 1;
                        } else {
                            answer += "R";
                            right1 = 1;
                            right2 = 1;
                        }
                    }

                    break;

                case 6:
                    right1 = 1;
                    right2 = 2;
                    answer += "R";
                    break;

                case 7:
                    left1 = 2;
                    left2 = 0;
                    answer += "L";
                    break;

                case 8:
                    move1 = 2;
                    move2 = 1;

                    if (Math.abs(move1 - left1) + Math.abs(move2 - left2) < Math.abs(move1 - right1) + Math.abs(move2 - right2)) {
                        answer += "L";
                        left1 = 2;
                        left2 = 1;
                    } else if (Math.abs(move1 - left1) + Math.abs(move2 - left2) > Math.abs(move1 - right1) + Math.abs(move2 - right2)) {
                        answer += "R";
                        right1 = 2;
                        right2 = 1;
                    } else {
                        if (hand.equals("left")) {
                            answer += "L";
                            left1 = 2;
                            left2 = 1;
                        } else {
                            answer += "R";
                            right1 = 2;
                            right2 = 1;
                        }
                    }

                    break;

                case 9:
                    right1 = 2;
                    right2 = 2;
                    answer += "R";
                    break;

                case 0:
                    move1 = 3;
                    move2 = 1;

                    if (Math.abs(move1 - left1) + Math.abs(move2 - left2) < Math.abs(move1 - right1) + Math.abs(move2 - right2)) {
                        answer += "L";
                        left1 = 3;
                        left2 = 1;
                    } else if (Math.abs(move1 - left1) + Math.abs(move2 - left2) > Math.abs(move1 - right1) + Math.abs(move2 - right2)) {
                        answer += "R";
                        right1 = 3;
                        right2 = 1;
                    } else {
                        if (hand.equals("left")) {
                            answer += "L";
                            left1 = 3;
                            left2 = 1;
                        } else {
                            answer += "R";
                            right1 = 3;
                            right2 = 1;
                        }
                    }

                    break;
            }
        }
        return answer;
    }
}
