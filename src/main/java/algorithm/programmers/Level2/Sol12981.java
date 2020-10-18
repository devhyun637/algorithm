package algorithm.programmers.Level2;

import java.util.Arrays;
import java.util.HashMap;

//영어 끝말잇기
public class Sol12981 {
    public static void main(String[] args) {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(Arrays.toString(solution(n, words)));
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        HashMap<String, Integer> hashMap = new HashMap<>(); //단어, 번호

        char startWord;
        char endWord = words[0].charAt(words[0].length() - 1);
        hashMap.put(words[0], 1);
        answer[1] = 1;

        for (int i = 1; i < words.length; i++) {
            startWord = words[i].charAt(0);
            answer[0] = (i + 1) % n;

            if (answer[0] == 0) answer[0] = n;
            if (answer[0] == 1) answer[1]++;

            if (startWord != endWord) break;
            if (hashMap.containsKey(words[i])) break;

            hashMap.put(words[i], answer[0]);
            endWord = words[i].charAt(words[i].length() - 1);

            if (i == words.length - 1) {
                answer[0] = answer[1] = 0;
            }
        }

        return answer;
    }
}
