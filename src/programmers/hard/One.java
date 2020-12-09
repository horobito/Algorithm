package programmers.hard;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(solution(a));

        int[][]arr = new int[5][6];





    }

        public static int solution(int n) {

            int answer = 0;

            int k = n;
            int t = n;
            int a = 0;

            for(int i =3; k>=3 ; i*=3){
                k = k/3;
                a++;
            }

            int size = a+1;

            int[] third = new int[size];

            for(int i=0; i<third.length; i++){
                third[i] = (int)(t/Math.pow(3, a));
                t = t - (int)(third[i]*Math.pow(3, a));
                a--;
            }

            int[] reverseThird = new int[third.length];

            for(int i=0; i<third.length; i++){
                reverseThird[i] = third[third.length-1-i];
            }

            for(int i=0; i<reverseThird.length; i++){
                answer += reverseThird[i]*Math.pow(3, reverseThird.length-1-i);
            }

            return answer;
        }

}
