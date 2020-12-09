package programmers.problems1;

public class GCM_LCM {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        answer[0] =gcdCalculate(max, min);
        answer[1] = max*min/answer[0];

        return answer;
    }
    public int gcdCalculate(int p, int q){
        if(p%q==0){
            return p;
        }
        return gcdCalculate(q, p%q); // 재귀 사용 시 주의

    }
}
