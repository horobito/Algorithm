package backjun.step3_for_Statement;

import java.io.*;
import java.util.StringTokenizer;

public class Num11_UnderTheX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer arr = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        for(int i=1; i<=n; i++){
            int a = Integer.parseInt(arr.nextToken());
            if(a<x){
                bw.write(a + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
