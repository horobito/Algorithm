package backjun.step4_while_Statement;


import java.util.Scanner;


public class Num2_1_EOF_Scanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()){
            int a = sc.nextInt();
            int b= sc.nextInt();

            System.out.println(a+b);
        }


    }

}
