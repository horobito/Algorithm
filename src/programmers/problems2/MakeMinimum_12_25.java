package programmers.problems2;

import java.util.Arrays;

public class MakeMinimum_12_25 {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int lastIndexB = B.length-1;


        for (int i = 0; i<A.length; i++){
            answer += A[i]*B[lastIndexB-i];
        }



        return answer;
    }
}
