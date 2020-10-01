package algorithm.backjoon.$2010;

import java.util.ArrayList;
import java.util.Scanner;

//모든순열 
public class Sol10974 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 1; i <= num; i++) arrayList.add(i);
        permutation(arrayList, resultList, num, num);
    }

    public static void permutation(ArrayList<Integer> arrayList, ArrayList<Integer> resultList, int n, int r) {
        if (r == 0) {
            for (Integer integer : resultList) System.out.print(integer + " ");
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            resultList.add(arrayList.remove(i));
            permutation(arrayList, resultList, n - 1, r - 1);
            arrayList.add(i, resultList.remove(resultList.size() - 1));
        }
    }
}
