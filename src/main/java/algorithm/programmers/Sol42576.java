package algorithm.programmers;

import java.util.Arrays;

public class Sol42576 {
    public static void main(String[] args) {
        String[] arr1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] arr2 = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(arr1, arr2));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i=0 ; i<completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                answer = participant[i];
                break;
            }
        }

        if (answer == "") answer = participant[participant.length-1];

        return answer;
    }
}