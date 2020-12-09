package backjun.step1_InputAndOutPut;

import java.util.Scanner;

public class Num11_Multiply {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int b1 = b%10;
        int b2 = (b/10)%10;
        int b3 = b/100;

        int r1 = b1*a;
        int r2 = b2*a;
        int r3 = b3*a;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        int result = r1 + r2*10 + r3*100;

        System.out.println(result);

    }
}
