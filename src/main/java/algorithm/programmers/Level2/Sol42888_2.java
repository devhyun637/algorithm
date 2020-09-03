package algorithm.programmers.Level2;

import java.util.Arrays;
import java.util.HashMap;

//오픈채팅
public class Sol42888_2 {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        System.out.println(Arrays.toString(solution(record)));
    }

    public static String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        int answerNum = record.length;

        for (String s : record) {
            String[] splitStr = s.split(" ");

            if (splitStr[0].equals("Enter")) map.put(splitStr[1], splitStr[2]);
            else if (splitStr[0].equals("Change")) {
                map.put(splitStr[1], splitStr[2]);
                answerNum--;
            }
        }

        String[] answer = new String[answerNum];
        int count = 0;

        for (String s : record) {

            String[] splitStr = s.split(" ");
            String id = splitStr[1];

            if (splitStr[0].equals("Enter")) {
                answer[count] = map.get(id) + "님이 들어왔습니다.";
                count++;
            } else if (splitStr[0].equals("Leave")) {
                answer[count] = map.get(id) + "님이 나갔습니다.";
                count++;
            }

        }

        return answer;
    }
}
