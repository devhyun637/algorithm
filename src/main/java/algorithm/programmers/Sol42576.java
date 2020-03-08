package algorithm.programmers;

import java.util.Arrays;

public class Sol42576 {
    public static void main(String[] args) {
        String[] arr1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] arr2 = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(arr1, arr2));
    }

    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        String answer = participant[participant.length - 1];

        for(int i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])) return participant[i];
        }

        return answer;
    }
}