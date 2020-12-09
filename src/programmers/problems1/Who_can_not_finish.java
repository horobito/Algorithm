package programmers.problems1;


import java.util.Arrays;
import java.util.Scanner;


public class Who_can_not_finish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i<completion.length; i++){
            if(!(participant[i].equals(completion[i]))){
                answer=participant[i];
                return answer;
            }
        }
        return participant[participant.length-1];

    }
}


//        String answer = "";
//
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//
//        for(int i=0; i<completion.length; i++){
//            if(participant[i]==completion[i]){
//                answer=participant[i];
//                return answer;
//            }
//        }

