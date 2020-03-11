package algorithm.programmers.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//기능개발

public class Sol42586 {
    public static void main(String[] args) {
        int[] progresses = {40, 93, 30, 55, 60, 65};
        int[] speeds = {60, 1, 30, 5, 10, 7};

        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        //몇일 걸리는가?
        int[] count = new int[progresses.length];

        for (int i = 0; i < count.length; i++) {
            int day = 1;
            while (progresses[i] + day * speeds[i] < 100) {
                day++;
            }
            count[i] = day;
        }

        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int value : count) {

            if (!q.isEmpty() && q.peek() < value) {
                list.add(q.size());
                q.clear();
            }

            q.add(value);
        }
        list.add(q.size());

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
