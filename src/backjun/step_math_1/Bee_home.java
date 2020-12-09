package backjun.step_math_1;

import java.util.Scanner;

public class Bee_home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = 0;

        int input = sc.nextInt();

        if(input==1){
            answer = 1;

        }else if(input<=7){
            answer = 2;
        }else {
            int floor = (int)((3 + Math.sqrt(9-12*(1-input)))/6 ) ;

            int first = (int)(1+ 3*Math.pow(floor, 2) + 3*(floor));

            answer = floor + Math.abs(first-input)%(floor-1);


        }


        System.out.println(answer);
    }
}
