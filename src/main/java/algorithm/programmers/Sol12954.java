package algorithm.programmers;
//x만큼 간격이 있는 n개의 숫자
public class Sol12954 {
    public static void main(String[] args) {
        for (long value : solution(-10000000,1000)) {
            System.out.print(value +" ");
        }
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long)x * (i + 1);
        }
        return answer;
    }
}
