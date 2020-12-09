package backjun.step_Dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LIS2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());

        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] fowardArrayScores = new int[length];
        int[] backwardArrayScores = new int[length];
        fowardArrayScores[0] = 1;
        backwardArrayScores[0] = 1;

        for(int i =1; i<length; i++){
            int max =0;
            int score = 1;
            for (int j = i-1; j>-1; j--){

                if(numbers[j]<numbers[i]){
                    if(max<fowardArrayScores[j]){
                        max = fowardArrayScores[j];
                        score = fowardArrayScores[j] +1;
                    }
                }
            }
            fowardArrayScores[i] = score;
        }

        for(int i =length-1; i>-1; i--){
            int max =0;
            int score = 1;
            for (int j = i+1; j<length; j++){

                if(numbers[j]<numbers[i]) {
                    if (max < backwardArrayScores[j]) {
                        max = backwardArrayScores[j];
                        score = backwardArrayScores[j] + 1;
                    }
                }
            }
            backwardArrayScores[i] = score;
        }

        int[] totalScores = new int[length];

        totalScores[0] =  fowardArrayScores[0] + backwardArrayScores[0];
        int answer =  totalScores[0];
        for(int i=1; i<length; i++){
            totalScores[i] = fowardArrayScores[i] + backwardArrayScores[i];
            if(totalScores[i]>answer){
                answer = totalScores[i];
            }


        }

        System.out.println(answer-1);
    }
}
