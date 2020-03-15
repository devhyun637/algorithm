package algorithm.programmers.Level1;

import java.util.Arrays;

public class Sol17681 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(solution(n, arr1, arr2)));
    }

    //풀이1
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] array1 = new int[n][n];
        int[][] array2 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (arr1[i] == 0) array1[i][j] = 0;
                else {
                    array1[i][j] = arr1[i] % 2;
                    arr1[i] = arr1[i] / 2;
                }

                if (arr2[i] == 0) array2[i][j] = 0;
                else {
                    array2[i][j] = arr2[i] % 2;
                    arr2[i] = arr2[i] / 2;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (array1[i][j] == 1 || array2[i][j] == 1) str.append('#');
                else str.append(" ");
            }
            answer[i] = str.toString();
        }

        return answer;
    }

    //풀이2
//    public static String[] solution(int n, int[] arr1, int[] arr2) {
//        String[] result = new String[n];
//        for (int i = 0; i < n; i++) {
//            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
//        }
//
//        for (int i = 0; i < n; i++) {
//            result[i] = String.format("%" + n + "s", result[i]);
//            result[i] = result[i].replaceAll("1", "#");
//            result[i] = result[i].replaceAll("0", " ");
//        }
//
//        return result;
//    }
}
