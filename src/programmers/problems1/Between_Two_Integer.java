package programmers.problems1;

public class Between_Two_Integer {
    public long solution(int a, int b) {
        long num = Math.abs(a-b+1);

        return num*(a+b)/2;
    }
}
