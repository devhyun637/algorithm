package algorithm.programmers.Level1;

import java.util.HashMap;

//완주하지 못한 선수
public class Sol42576_2 {
    public static void main(String[] args) {

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hs = new HashMap<>();

        for (String s : participant) {
            hs.put(s, hs.getOrDefault(s, 0) + 1);
        }

        for (String c : completion) {
            hs.put(c, hs.getOrDefault(c, 0) - 1);
        }

        for (String str : hs.keySet()) {
            if (hs.get(str) == 1) answer = str;
        }

        return answer;
    }
}
