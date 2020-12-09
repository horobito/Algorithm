package backjun.step5_Training1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Num6_Point_Star_21 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();

        int floor = 1;

        if(n==1){
            bw.write("*");


        }else {
            while (floor<=n){
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 1) {
                        bw.write("*");
                    } else {
                        bw.write(" ");
                    }
                }
                bw.write("\n");
                for (int j = 1; j <= n; j++) {
                    if (j % 2 != 1) {
                        bw.write("*");
                    } else {
                        bw.write(" ");
                    }
                }
                bw.write("\n");

                floor++;
            }

        }

        bw.flush();
        bw.close();
    }
}
