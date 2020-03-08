package algorithm.programmers;

public class Sol12919 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution(seoul));
    }
    public static String solution(String[] seoul) {
        int num = 0;

        for (int i=0; i<seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                num = i;
                break;
            }
        }
        return "김서방은 "+num+"에 있다";
    }
}
