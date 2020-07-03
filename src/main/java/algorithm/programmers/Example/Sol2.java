package algorithm.programmers.Example;

import java.util.Arrays;

//순열 검사
public class Sol2 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 3};
        System.out.println(solution(arr));
    }

    public static boolean solution(int[] arr) {
        boolean answer = true;
        Arrays.sort(arr);
        int maxNum = arr[arr.length - 1];


        //적게 들어있다면 false
        if (maxNum != arr.length) return false;
        else {
            //중복해서 들어있다면 false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != (i + 1)) return false;
            }
        }
        return answer;
    }
}
