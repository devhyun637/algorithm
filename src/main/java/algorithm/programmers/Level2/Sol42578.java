package algorithm.programmers.Level2;

import java.util.HashMap;

//위장
public class Sol42578 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hs = new HashMap<>();

        for (String[] clothe : clothes) {
            String key = clothe[1];
            hs.put(key, hs.getOrDefault(key, 0) + 1);
        }

        for (String key : hs.keySet()) {
            answer *= hs.get(key) + 1;
        }
        answer += -1;
        return answer;
    }
}
