package programmers.problems1;

import java.util.Scanner;

public class PointSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String[] arr = new String[b];

        for(int i=0; i<b; i++){
            arr[i] ="";
            for(int j=0; j<a; j++){
                arr[i] += "*";
            }
            System.out.println(arr[i]);
        }

    }
}
