package algorithm.programmers.Level2;

import java.util.PriorityQueue;
//더 맵게
public class Sol42626 {
    public static void main(String[] args) {
        int[] scoville = {1, 1, 1, 1};
        int K = 100;
        System.out.println(solution(scoville, K));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int s : scoville) {
            pq.add(s);
        }

        while (true) {
            if (pq.size() >= 2) {
                if (pq.peek() < K) {
                    int newNum = pq.poll() + pq.poll() * 2;
                    pq.add(newNum);
                    answer++;
                } else break;
            } else {
                if (pq.peek() > K) break;
                else return -1;
            }
        }
        return answer;
    }
}
