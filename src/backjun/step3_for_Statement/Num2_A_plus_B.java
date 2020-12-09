package backjun.step3_for_Statement;

import java.util.Scanner;

public class Num2_A_plus_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        int[] answer = new int[test];

        for(int i=0; i<test; i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            answer[i] = a+b;
        }

        for(int arr : answer){
            System.out.println(arr);
        }

    }

}
