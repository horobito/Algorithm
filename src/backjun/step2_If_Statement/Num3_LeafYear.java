package backjun.step2_If_Statement;

import java.util.Scanner;

public class Num3_LeafYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        boolean flag = false;

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    flag = true;
                }
            }else{
                flag = true;
            }

        }

        if(flag==true){
            System.out.println(1);
        }else{
            System.out.println(0);
        }


    }
}
