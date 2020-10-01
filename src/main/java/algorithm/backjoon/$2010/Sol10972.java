package algorithm.backjoon.$2010;

import java.util.Arrays;
import java.util.Scanner;

//다음 순열
public class Sol10972 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[sc.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int checkPoint1 = -1;
        int checkPoint2 = -1;
        int index = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                checkPoint1 = i;
                index = i + 1;
            }
        }

        if (checkPoint1 == -1) System.out.println(-1);
        else {
            for (int i = array.length - 1; i >= index; i--) {
                if (array[checkPoint1] <= array[i]) {
                    checkPoint2 = i;
                    break;
                }
            }

            int num = array[checkPoint2];
            array[checkPoint2] = array[checkPoint1];
            array[checkPoint1] = num;

            int[] sortArray = Arrays.copyOfRange(array, index, array.length);
            Arrays.sort(sortArray);

            for (int i : sortArray) array[index++] = i;
            for (int i : array) System.out.print(i + " ");
        }


    }
}
