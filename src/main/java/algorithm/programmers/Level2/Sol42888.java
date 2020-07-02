package algorithm.programmers.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//오픈채팅
public class Sol42888 {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        System.out.println(Arrays.toString(solution(record)));
    }

    public static String[] solution(String[] record) {
        String[] answer;
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(record));
        HashMap<String, String> hs = new HashMap<>();
        ArrayList<String> chatting = new ArrayList<>();

        for (String s : arr) {
            if (s.startsWith("Enter") || s.startsWith("Change")) {
                String[] nickName = s.split(" ");
                hs.put(nickName[1], nickName[2]);
            }
        }

        for (String s : arr) {
            String[] nickName = s.split(" ");
            if (s.startsWith("Enter")) {
                chatting.add(hs.get(nickName[1]) + "님이 들어왔습니다.");
            } else if (s.startsWith("Leave")) {
                chatting.add(hs.get(nickName[1]) + "님이 나갔습니다.");
            }
        }

        answer = new String[chatting.size()];
        for (int i = 0; i < chatting.size(); i++) {
            answer[i] = chatting.get(i);
        }

        return answer;    }
}
