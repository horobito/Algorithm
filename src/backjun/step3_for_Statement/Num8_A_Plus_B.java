package backjun.step3_for_Statement;

import java.io.*;
import java.util.StringTokenizer;

public class Num8_A_Plus_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int test = Integer.parseInt(br.readLine());

        for(int i=1; i<=test; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = a+b;

            bw.write("Case #" + i + ": " + a + " + " + b + " = " + c + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
