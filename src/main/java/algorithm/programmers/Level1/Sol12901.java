package algorithm.programmers.Level1;

//2016년
public class Sol12901 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(1,3));

    }

    static class Solution {
        public String solution(int a, int b) {
            //윤년은 2월이 29일
            int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

            for (int i = 0; i < a - 1; i++) {
                b += month[i];
            }

            return week[b % 7];
        }
    }
}
