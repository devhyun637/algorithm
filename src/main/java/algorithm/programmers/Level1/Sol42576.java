package algorithm.programmers.Level1;

import java.util.Arrays;

//완주하지 못한 선수
public class Sol42576 {
    public static void main(String[] args) {
        String[] arr1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] arr2 = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(arr1, arr2));
    }

    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = "";

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }
        if (answer.equals("")) return participant[participant.length - 1];
        return answer;
    }
}