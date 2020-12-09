package programmers.problems1;

import java.util.ArrayList;

public class NoSameNumbers {
    public int[] solution(int []arr) {

        ArrayList<Integer> al = new ArrayList<>(1);
        al.add(arr[0]);
        int prev = al.get(0);

        for(int i =1; i<arr.length; i++){
            if(arr[i]!=prev){
                al.add(arr[i]);
            }
            prev = arr[i];
        }

        int[] answer = new int[al.size()];
        for(int i =0; i<al.size(); i++){
            answer[i] = al.get(i);
        }

        return answer;
    }
}

//
