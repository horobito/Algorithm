package backjun.step5_Training1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Num5_Point_Star_9 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = sc.nextInt();

        for(int i=n; i>1; i--){

            for(int j=1; j<=n-i; j++){
                bw.write(" ");
            }

            for(int j=1; j<2*i; j++){
                bw.write("*");
            }
            bw.write("\n");

        }

        for(int i=1; i<=n; i++){
            for(int a=i; a<n; a++){
                bw.write(" ");
            }

            for(int b=1; b<2*i; b++){
                bw.write("*");
            }

            bw.write("\n");

        }

        bw.flush();
        bw.close();
    }
}
