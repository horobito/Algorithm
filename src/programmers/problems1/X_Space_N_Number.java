package programmers.problems1;

public class X_Space_N_Number {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0; i<n; i++){
            answer[i] = (long)(i+1) * x; // 범위에 주의
        }
        return answer;
    }
}
