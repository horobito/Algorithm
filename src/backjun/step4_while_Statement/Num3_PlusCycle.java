package backjun.step4_while_Statement;

import java.util.Scanner;

public class Num3_PlusCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = n;

        int cycle = 0;

        while(true){
            if(x<10){
                int one = x%10;

                x = x*10;

                int ten = x/10;
                int one2 = x%10;

                x = one*10 + (ten+one2)%10;

                cycle +=1;

                if(x == n){
                    break;
                }

            }else{

                int one = x%10;

                int ten = x/10;
                int one2 = x%10;

                x = one*10 + (ten+one2)%10;

                cycle +=1;

                if(x == n){
                    break;
                }
            }
        }

        System.out.println(cycle);

    }
}
