package backjun.step3_for_Statement;

import java.util.Scanner;

public class Num5_PointN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=n; i>0; i--){
            System.out.println(i);
        }
    }
}
