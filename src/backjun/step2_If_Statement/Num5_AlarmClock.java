package backjun.step2_If_Statement;

import java.util.Scanner;

public class Num5_AlarmClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if(hour>0){
            if(minute<45){
                hour = hour-1;
                minute = 60-(45-minute);
            }else{
                minute = minute-45;
            }
        }else{
            if(minute<45){
                hour = 23;
                minute = 60-(45-minute);
            }else{
                minute = minute-45;
            }
        }


        System.out.println(hour + " " + minute);
    }

}
