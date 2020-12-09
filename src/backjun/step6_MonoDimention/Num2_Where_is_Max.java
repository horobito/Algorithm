package backjun.step6_MonoDimention;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Num2_Where_is_Max {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = sc.nextInt();
        int line = 1;
        int maxLine =1;


        while (sc.hasNextInt()){
            int a = sc.nextInt();
            sc.nextLine();
            line ++;
            if(max<a){
                max = a;

                maxLine= line;
            }
        }

        bw.write(max + " " + maxLine);
        bw.flush();
        bw.close();
    }
}
