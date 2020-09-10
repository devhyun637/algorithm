package algorithm.backjoon.$2009;

import java.util.Scanner;

//다음 순열
public class Sol10972 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int checkPoint1 = 0;
        int checkPoint2 = 0;

        //5 4 3 2 1
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = num - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                checkPoint1 = i;
                break;
            }
        }

        if (checkPoint1 == 0) System.out.println(-1);
        else {
            for (int i = checkPoint1; i < num; i++) {
                if (arr[checkPoint1 - 1] < arr[i]) checkPoint2 = i;
            }

            int tmp = arr[checkPoint2];
            arr[checkPoint2] = arr[checkPoint1 - 1];
            arr[checkPoint1 - 1] = tmp;

            for (int i = checkPoint1; i < num; i++) {
                for (int j = i + 1; j < num; j++) {
                    if (arr[i] > arr[j]) {
                        int number = arr[i];
                        arr[i] = arr[j];
                        arr[j] = number;
                    }
                }
            }

            for (int i : arr) System.out.print(i + " ");
        }
    }
}
