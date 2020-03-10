package algorithm.programmers.Level1;

//평균구하기
public class Sol12944 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(solution(arr));
    }

    public static double solution(int[] arr) {
        double answer = 0;

        for (int value : arr) {
            answer += value;
        }
        return answer / arr.length;
    }
}
