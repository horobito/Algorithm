package programmers.problems2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Utility_Development {
    public static void main(String[] args) {
        int[] progressess = {0, 0, 0, 0};
        int[ ]speeds = {100, 50, 34, 25};
        int[] answer = solution(progressess, speeds);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] days = new int[progresses.length];

        for (int  i = 0; i<progresses.length; i++ ){
            days[i] = (int)Math.ceil((100-progresses[i])/(double)speeds[i]);
        }

        ArrayList<Integer> result = new ArrayList<>(1);

        int counts = 1;

        int max = days[0];
        for (int i =1; i<days.length; i++){
            if(max>=days[i]){
                counts++;

            }else {
                result.add(counts);
                max = days[i];
                counts = 1;
            }
            if(i== days.length-1){
                result.add(counts);
            }

        }

        int[] answer = new int[result.size()];

        for (int i = 0 ;i<result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }

}
