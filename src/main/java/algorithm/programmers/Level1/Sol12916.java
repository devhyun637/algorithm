package algorithm.programmers.Level1;

//문자열 내 p와 y의 개수
public class Sol12916 {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(solution(s));
    }
    static boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;

        char[] str = s.toLowerCase().toCharArray();
        for (char ch : str){
            if (ch == 'y') yCount++;
            if (ch == 'p') pCount++;
        }

        return yCount == pCount;
    }
}
