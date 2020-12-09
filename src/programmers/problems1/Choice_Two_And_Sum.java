package programmers.problems1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Choice_Two_And_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a  = new int[5];
        for(int i=0; i<5; i++){
         a[i] = sc.nextInt();
        }


        System.out.println(Arrays.toString(solution(a)));

    }

    public static int[] solution(int[] numbers) {


        int tempSize = 0;

        ArrayList<Integer> temp = new ArrayList<>(1);
        ArrayList<Integer> answerList = new ArrayList<>(1);


        for(int i=0; i<numbers.length-1; i++){
            for(int j =i+1; j<numbers.length; j++){
                temp.add(numbers[i] + numbers[j]);
                tempSize++;
            }
        }

        int[] tempArray = new int[tempSize];

        for(int i =0; i<tempSize; i++){
            tempArray[i] = temp.get(i);
        }

        Arrays.sort(tempArray);
        answerList.add(tempArray[0]);

        for(int i =1; i<tempSize; i++){
            if(tempArray[i]!=tempArray[i-1]){
                answerList.add(tempArray[i]);
            }
        }

        int[] answer = new int[answerList.size()];

        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }


        return answer;
    }
}
