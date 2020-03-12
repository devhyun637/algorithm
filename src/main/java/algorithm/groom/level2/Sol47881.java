package algorithm.groom.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//근묵자흑
class Sol47881 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] firstStr = input.split(" ");
        int answer = 0;
        int n = Integer.parseInt(firstStr[0]);
        int k = Integer.parseInt(firstStr[1]);
        String number = br.readLine();

        n = n - k;
        answer++;
        while (n >= k) {
            n = (n + 1) - k;
            answer++;
        }
        if (n != 0) answer++;

        System.out.println(answer);
    }
}
