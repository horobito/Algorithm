package backjun.step6_MonoDimention;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Num4_Remainder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;

        ArrayList<Integer> arr = new ArrayList<>(1);

        while ((line = br.readLine()) != null) {
            try {
                arr.add(Integer.parseInt(line));
            }catch (Exception e){
                break;
            }
        }

        int[] remainder = new int[arr.size()];

        int t=0;

        for(int a: arr){

            remainder[t] = (arr.get(t))%42;
            t++;
        }

        int count = 1;

        Arrays.sort(remainder);

        for(int i=0; i<remainder.length-1; i++){
            if(remainder[i]!=remainder[i+1]){
                count += 1;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }
}
