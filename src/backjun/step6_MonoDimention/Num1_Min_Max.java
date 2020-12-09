package backjun.step6_MonoDimention;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Num1_Min_Max {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>(1);

        while (st.hasMoreTokens()){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        int max = arr.get(arr.size()-1);
        int min = arr.get(arr.size()-1);

        for(int i=arr.size()-2; i>=0; i--){
            if(arr.get(i)>=max){
                max = arr.get(i);
            }

            if(arr.get(i)<=min){
                min = arr.get(i);
            }

        }

        bw.write(min + " " + max);

        bw.flush();
        bw.close();

    }
}
