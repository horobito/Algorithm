package programmers.problems1;

public class RootOfInteger {
    public long solution(long n) {
        double root = (double)Math.sqrt(n);
        return (root%1==0) ? (long)Math.pow(root+1, 2): -1;
    }
}
