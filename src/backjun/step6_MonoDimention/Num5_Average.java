package backjun.step6_MonoDimention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num5_Average {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        String temp = br.readLine();
        String[] arr = temp.split(" ");

        double sum = 0;
        double[] scores = new double[arr.length];
        for (int i =0; i< scores.length; i++){
            scores[i] = Integer.parseInt(arr[i]);
            sum += scores[i];
        }

        double max = scores[0];
        for (int i =0; i< scores.length; i++){
            if(max<scores[i]){
                max = scores[i];
            }
        }

        double answer = (sum*100)/(max*n);

        System.out.println(answer);

    }
}
