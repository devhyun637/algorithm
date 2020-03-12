package algorithm.groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//factorial
public class Sol43192 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int num = Integer.parseInt(input);
        long[] d = new long[num + 1];
        d[0] = 0;
        d[1] = 1;

        for (int i = 2; i <= num; i++) {
            d[i] = d[i - 1] * i;
        }

        System.out.println(d[num]);
    }
}
