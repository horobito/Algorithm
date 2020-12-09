package backjun.step5_Training1;

import java.util.Scanner;

public class Num2_Cheapest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num =0;

        int minBurger = sc.nextInt();

        for(int i=1; i<3; i++){
            int other = sc.nextInt();
            if(minBurger>other){
                minBurger = other;
            }
        }



        int liquid1 = sc.nextInt();
        int liquid2 = sc.nextInt();

        int minLiquid = Math.min(liquid1, liquid2);



        System.out.println(minBurger + minLiquid - 50);
    }
}
