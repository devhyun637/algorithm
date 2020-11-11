package algorithm.programmers.Level2;

import java.util.ArrayList;


/*
    [방금 그곡]

    생각할 부분
     - 문제에 주어진 조건을 모두 적용했는가?
     - 치환
 */
public class Sol17683 {
    public static void main(String[] args) {
        String m = "ABC";
        String[] musicinfos = {"00:00,00:06,HI,ABC#ABC", "00:00,00:10,HELLO,ABC#ABC", "00:00,00:20,KKK,ABC#ABC", "00:00,00:20,HELLOOO,ABC#ABC"};
        System.out.println(solution(m, musicinfos));
    }

    public static String solution(String m, String[] musicinfos) {
        String answer = "";
        String[] listen = m.split("");
        ArrayList<String> lyric = makeNewLyrics(listen);
        int selectMusicLen = 0;

        String listenLyric = "";
        for (String str : lyric) {
            listenLyric += str;
        }

        for (String musicinfo : musicinfos) {
            String[] songInfo = musicinfo.split(",");

            //첫번째는 시작하는 시간
            String[] startTime = songInfo[0].split(":");
            int start = Integer.parseInt(startTime[0]) * 60 + Integer.parseInt(startTime[1]);
            //두번째는 끝나는 시간
            String[] endTime = songInfo[1].split(":");
            int end = Integer.parseInt(endTime[0]) * 60 + Integer.parseInt(endTime[1]);

            int musicLen = end - start;

            //# 치환해주기
            String[] splitLyrics = songInfo[3].split("");
            ArrayList<String> partLyrics = makeNewLyrics(splitLyrics);

            String wholeLyrics = "";
            for (int j = 0; j < musicLen; j++) {
                wholeLyrics += partLyrics.get(j % partLyrics.size());
            }

            //테스트케이스 20 27 28번과 관련
            if (wholeLyrics.contains(listenLyric)) {
                if (selectMusicLen < musicLen) {
                    answer = songInfo[2];
                    selectMusicLen = musicLen;
                }
            }
        }
        if (answer.equals("")) answer = "(None)";
        return answer;
    }

    public static ArrayList<String> makeNewLyrics(String[] lyrics) {
        ArrayList<String> lyric = new ArrayList<>();

        for (String str : lyrics) {
            if (str.equals("#")) {
                String newStr = lyric.get(lyric.size() - 1).toLowerCase();
                lyric.set(lyric.size() - 1, newStr);
            } else {
                lyric.add(str);
            }
        }

        return lyric;
    }
}