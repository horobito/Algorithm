package programmers.problems1;

import java.util.Arrays;

public class DescendingOrder {
    public long solution(long n) {
        String a = Long.toString(n);
        String[] b = a.split("");
        String answer = "";
        Arrays.sort(b);

        for(int i = b.length-1; i>=0; i--){
            answer += b[i];
        }

        return Long.parseLong(answer);
    }
}

// Integer와 int
// Integer와 long
