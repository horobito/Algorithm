package backjun.step3_for_Statement;

import java.util.Scanner;

public class Num1_9999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<10; i++){
            System.out.println(n+" * "+i+" = "+ n*i);
        }
    }
}
