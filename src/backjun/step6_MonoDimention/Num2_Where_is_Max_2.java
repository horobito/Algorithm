package backjun.step6_MonoDimention;

import java.io.*;

public class Num2_Where_is_Max_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = Integer.parseInt(br.readLine());

        int line = 1;
        int maxLine =1;

        String exe;


        while ((exe=br.readLine())!=null){
            try {
                line ++;

                int a = Integer.parseInt(exe);
                if(a>=max){
                    max = a;
                    maxLine = line;
                }
            }catch (Exception e){
                break;
            }

        }

        bw.write(max + " " + maxLine);
        bw.flush();
        bw.close();
    }
}

//        while ((exe=br.readLine())!=null){
//                try {
//                line ++;
//
//                st = new StringTokenizer(exe);
//
//                int a = Integer.parseInt(st.nextToken());
//                if(a>=max){
//                max = a;
//                maxLine = line;
//                }
//                }catch (Exception e){
//                break;
//                }
//
//                }
