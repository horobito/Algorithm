package programmers.problems1;

import java.util.ArrayList;
import java.util.Arrays;

public class Can_devide {
    public int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> al = new ArrayList<>(1);

        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                al.add(arr[i]);
            }
            if(i==arr.length-1 && al.isEmpty() ){
                al.add(-1);
            }
        }

        //https://bvc12.tistory.com/130

        int[] answer = new int[al.size()];

        int j=0;

        for(Integer a : al){
            answer[j] = al.get(j);
            j++;
        }

        Arrays.sort(answer);




        return answer;
    }
}
