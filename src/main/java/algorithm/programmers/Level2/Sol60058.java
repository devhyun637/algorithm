package algorithm.programmers.Level2;

//괄호 변환
public class Sol60058 {
    static String answer = "";
    public static void main(String[] args) {
        String p = "()))((()";
        System.out.println(solution(p));
    }

    public static String solution(String p) {
        if (p.equals("")) return "";
        return makeString(p);
    }

    public static String makeString(String p) {
        int index = splitString(p);
        String u = p.substring(0, index);
        String v = p.substring(index);

        if (checkString(u)) answer += u;
        else {
            answer += "(";
            if (!v.equals("")) {
                makeString(v);
                v = "";
            }
            answer += ")";
            answer += reverseString(u);
        }

        if (!v.equals("")) makeString(v);

        return answer;
    }

    public static int splitString(String p) {
        String[] w = p.split("");
        int chekcNum = 0;
        int index = 0;

        for (int i = 0; i < w.length; i++) {
            if (w[i].equals("(")) chekcNum++;
            else chekcNum--;

            if (chekcNum == 0) {
                index = i + 1;
                break;
            }
        }
        return index;
    }

    public static boolean checkString(String u) {
        String[] w = u.split("");
        int checkNum = 0;

        for (String s : w) {
            if (s.equals("(")) checkNum++;
            else checkNum--;

            if (checkNum < 0) return false;
        }
        return true;
    }

    public static String reverseString(String u) {
        String[] w = u.split("");
        String str = "";

        for (int i = 1; i < w.length - 1; i++) {
            if (w[i].equals("(")) str += ")";
            else str += "(";
        }
        return str;
    }
}
