package programmers.problems1;


import java.util.Scanner;
import java.util.Stack;

public class Yet_Country_of_124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println(solution(sc.nextInt()));
    }
    public static String solution(int n) {
        String answer = "";

        int input = n-1;

        Stack<Integer> st = new Stack<>();

        while (input>=3){

            int num = input%3;

            if(num==0){
                st.push(1);
            }else if(num==1){
                st.push(2);
            }else {
                st.push(4);
            }

            input = input/3;

        }

        if(input<3){
            if(input==0){
                st.push(1);
            }else if(input==1){
                st.push(2);
            }else {
                st.push(4);
            }

        }

        while (!st.isEmpty()){
            answer+=st.pop();
        }



        return answer;
    }


}
