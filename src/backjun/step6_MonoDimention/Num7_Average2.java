package backjun.step6_MonoDimention;

import java.io.*;
import java.util.stream.Stream;

public class Num7_Average2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.parseInt(br.readLine());
        String line;
        while (!(line = br.readLine()).isEmpty()){

            int[] scores = Stream.of(line.split(" ")).mapToInt(Integer::parseInt).toArray();

            double sum = 0;
            for(int i=1; i< scores.length; i++){
                sum += scores[i];
            }

            double average = sum/scores[0];


            double upperAverage = 0;

            for(int i=1; i< scores.length; i++){
                if(average<scores[i]){
                    upperAverage++;
                }
            }

            double ratio = (upperAverage/scores[0])*100;

            bw.write(String.format("%.3f", ratio) + "%"+ "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
