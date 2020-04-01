package algorithm.programmers.Level1;

//시저암호
public class Sol12926 {
    public static void main(String[] args) {
        String s = "abcdefghijklmnop";
        int n = 12;
        System.out.println(solution(s, n)); //z
    }

    public static String solution(String s, int n) {
        String answer = "";
        char[] ch = s.toCharArray();
        int ascii;

        for (int i = 0; i < s.length(); i++) {
            ascii = ch[i] + n;
            //A ~ Z
            if (ch[i] <= 'Z' && ascii > 'Z') ascii = ascii - 26;
            //a ~ z
            else if (ch[i] > 'Z' && ascii > 'z') ascii -= 26;
            else if (ch[i] == ' ') continue;
            ch[i] = (char) ascii;
        }

        for (char c : ch) answer += c;

        return answer;
    }
}
