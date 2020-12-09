package backjun.step_Recursive_function;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Arrays;
import java.util.Scanner;

public class Tower_Of_Hanoi_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int size = 1;


        for(int i = 1; i<=n; i++) {
            size *= i;
        }

        String[] arr = new String[size];

        arr[0] = " ";


        for (int i =1; i<=n; i++) {
            arr[0] +=  i + " ";
        }

        int inputIndex = 1;

        int stdIndex = 0;



        for(int i =1; i<n; i++){
            int stdNum = i+1;
            int addNum = 0;

            for (int swapedNum = stdNum-1; swapedNum>=1; swapedNum--){
                for (int j = stdIndex; j>=0; j--){


                        arr[inputIndex] = "";

                        arr[inputIndex++] = swap(stdNum, swapedNum, arr[j] );
                        addNum ++;


                }
            }

            stdIndex += addNum;

        }

        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    public static String swap(int stdNum, int swapedNum, String arr){
        int length = arr.length();



        String[] temp = arr.split(" ");

        String stdN  = Integer.toString(stdNum);

        String swapedN = Integer.toString(swapedNum);

        String answer = "";

        for(int i = 0; i<temp.length; i++){
            if (temp[i].equals(stdN) ){
                temp[i] = swapedN;
            }else if(temp[i].equals(swapedN)){
                temp[i] = stdN;
            }

            answer += temp[i] + " ";
        }

        return answer;

    }

}
