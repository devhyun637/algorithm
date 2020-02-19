package algorithm.programmers;

public class Sol12944 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(solution(arr));
    }

    public static double solution(int[] arr) {
        double answer = 0;
//        for (int i = 0; i < arr.length; i++) {
//            answer += arr[i];
//        }
        for (int value : arr) {
            answer += value;
        }
        return answer / arr.length;
    }
}
