package programmers.problems2;

import java.util.Arrays;

//
public class Pokenmon_12_25 {
    public static void main(String[] args) {
        int[] arr = {3,1,2,3};
        solution(arr);
    }
    public static int solution(int[] nums) {

        int kinds = 0;
        int std = -1;
        int gainableCount= 0;
        int answer = 0;
        gainableCount = (int)Math.floor(nums.length/2);
        Arrays.sort(nums);

        for (int num : nums){
            if(num !=std){
                kinds++;
                std = num;
            }
        }


        if(gainableCount>=kinds ){
            answer = kinds;
        }else {
            answer = gainableCount;
        }


        return answer;
    }
}
