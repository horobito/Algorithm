package programmers.problems2;

import java.util.LinkedList;
import java.util.Queue;

public class Yet_OverTheBridge {
    public static void main(String[] args) {
        int bridge_length = 5;
        int weight = 5;
        int[] truck_weight = {2, 2, 2, 2, 1, 1, 1, 1, 1};
        int answer = solution(bridge_length, weight, truck_weight);
        System.out.println(answer);
    }

    public static int solution(int bridge_length, int weightLimit, int[] truck_weights) {
        Queue<Integer> trucksIndex_OnTheBridge = new LinkedList<>();

        int truckLength = truck_weights.length;

        int inputWeight = 0;

        int output = 0;



        int seconds = bridge_length;

        int inputIndex = 0;
        while (inputIndex<truckLength && inputWeight+truck_weights[inputIndex]<=weightLimit){
                trucksIndex_OnTheBridge.add(inputIndex);
                inputWeight += truck_weights[inputIndex];
                inputIndex++;
        }

        if(trucksIndex_OnTheBridge.size()==truckLength){
            seconds += trucksIndex_OnTheBridge.size();
            return seconds;
        }

        for (int i = inputIndex; i<truckLength; i++){
            while (inputWeight+truck_weights[i]>weightLimit){
                inputWeight -= truck_weights[trucksIndex_OnTheBridge.peek()];
                trucksIndex_OnTheBridge.poll();
                output++;
            }

            trucksIndex_OnTheBridge.add(i);
            inputWeight += truck_weights[i];

            seconds+= 1+ output;
            if(output>0){
                seconds-=1;
            }
            if(i==truckLength-1){
                seconds+= bridge_length;
            }

            output = 0;

        }

        return seconds;


    }
}
