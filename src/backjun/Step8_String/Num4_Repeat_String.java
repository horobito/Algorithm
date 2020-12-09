package backjun.Step8_String;

import java.io.*;

public class Num4_Repeat_String {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testNum = Integer.parseInt(br.readLine());

        String line = "";
        for (int k =0; k<testNum; k++){
            line=br.readLine();
            int num = Integer.parseInt(String.valueOf(line.charAt(0)));
            String newString = line.substring(2, line.length());

            for (int i =0; i<newString.length(); i++){
                for (int j=0; j<num; j++){
                    bw.write(newString.charAt(i));
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
    /*
    숫자 N + " 문자열
    -> 문자열 N의 길이 이용 & 각 문자당 N만큼 반복
     */
}
