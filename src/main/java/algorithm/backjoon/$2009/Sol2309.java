package algorithm.backjoon.$2009;

import java.util.Arrays;
import java.util.Scanner;

//일곱 난쟁이
public class Sol2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] people = new int[9];
        int heightSum = 0;
        boolean find = false;

        for (int i = 0; i < 9; i++) {
            people[i] = sc.nextInt();
            heightSum += people[i];
        }

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (heightSum - (people[i] + people[j]) == 100) {
                    people[i] = people[j] = 0;
                    find = true;
                    break;
                }
            }
            if (find) break;
        }

        Arrays.sort(people);

        for (int person: people) {
            if (person != 0) System.out.println(person);
        }
    }
}
