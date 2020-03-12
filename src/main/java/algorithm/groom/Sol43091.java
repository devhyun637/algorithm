package algorithm.groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//유클리드 호제법
public class Sol43091 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] number = input.split(" ");
        int num1 = Math.max(Integer.parseInt(number[0]), Integer.parseInt(number[1]));
        int num2 = Math.min(Integer.parseInt(number[0]), Integer.parseInt(number[1]));

        while (num2 != 0) {
            int num3 = num2;
            num2 = num1 % num2;
            num1 = num3;
        }

        System.out.println(num1);
    }
}

