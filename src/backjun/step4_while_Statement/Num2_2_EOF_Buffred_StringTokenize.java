package backjun.step4_while_Statement;

import java.io.*;
import java.util.StringTokenizer;

public class Num2_2_EOF_Buffred_StringTokenize {
    public static void main(String[] args) throws IOException {

        // BufferdReader : 없으면 null 반환

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;

        while((line=br.readLine()) != null){
            try{
                StringTokenizer st = new StringTokenizer(line);

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                bw.write(a+b+"\n");
            }catch (Exception e){
                break;
            }

        }



        bw.flush();
        bw.close();

    }
}
