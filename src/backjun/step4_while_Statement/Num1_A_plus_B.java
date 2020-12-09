package backjun.step4_while_Statement;


import java.util.ArrayList;
import java.util.Scanner;

public class Num1_A_plus_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> al = new ArrayList<>(1);

        while (true){
                int a= sc.nextInt();
                int b = sc.nextInt();
                if(a==0 && b==0){
                    break;
                }
                sc.nextLine();
                al.add(a+b);


        }

        for(int k =0; k<al.size(); k++){
            System.out.println(al.get(k));
        }



    }
}
