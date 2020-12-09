package backjun.step5_Training1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Num4_Point_Star_13 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();

        for(int i=1; i<=2*n-1; i++){
            if(i<=n){
                for(int j=1; j<=i; j++){
                    bw.write("*");
                }
                bw.write("\n");
            }else{
                int a = i-n;
                for(int j=1; j<=n-a; j++){
                    bw.write("*");
                }
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
