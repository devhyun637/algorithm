package algorithm.programmers.Level1;

//김서방
public class Sol12919 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution(seoul));
    }
    public static String solution(String[] seoul) {
        int count = 0;

        for (int i=0; i<seoul.length; i++){
            if (seoul[i].equals("Kim")) {
                count = i;
                break;
            }
        }
        return "김서방은 " + count + "에 있다";
    }
}
