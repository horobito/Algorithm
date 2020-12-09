package backjun.step5_Training1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num3_ThreeNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();

        StringTokenizer st = new StringTokenizer(line);

        int[] arr = new int[3];

        int i=0;

        while(st.hasMoreTokens()){
            arr[i++] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        System.out.println(arr[1]);



    }
}
