package programmers.problems2;

import java.util.Arrays;

public class H_Index {
    public static void main(String[] args) {
        int[] citations = {0, 1,2,3,4,5,6,7,8,9,10};
        System.out.println(solution(citations));
    }
    public static int solution(int[] citations) {
        Arrays.sort(citations);
        int length = citations.length;

        int max = 0;
        for (int i = length-1; i>-1; i--){
            int min = Math.min(citations[i], length-i); // 교차하며 움직임
            if(max<min){
                max = min;
            }
        }

        return max;
    }

}
