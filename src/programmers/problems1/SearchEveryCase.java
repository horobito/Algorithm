package programmers.problems1;

import java.util.Arrays;

public class SearchEveryCase {
    public int[] solution(int[] answers) {

        int length = answers.length;
        int[] one = new int[length];
        int[] two = new int[length];
        int[] three = new int[length];

        int[] scores = new int[3];

        for (int i =0; i<length; i++){
            one[i] = (i%5)+1;

            if(i%2==0){
                two[i] = 2;
            }else {
                switch (i%8){
                    case 1:
                        two[i] =1;
                        break;
                    case 3:
                        two[i] =3;
                        break;
                    case 5:
                        two[i] =4;
                        break;
                    case 7:
                        two[i] =5;
                        break;
                }
            }

            int stdThree = i%10;

            if(stdThree<=1){
                three[i] = 3;
            }else if(stdThree<=3){
                three[i] = 1;
            }else if(stdThree<=5){
                three[i] = 2;
            }else if(stdThree<=7){
                three[i] = 4;
            }else if(stdThree<=9){
                three[i] = 5;
            }


        }



        for (int index = 0 ;index<length; index++){
            if(one[index] == answers[index]){
                scores[0]++;
            }
            if(two[index] == answers[index]){
                scores[1]++;
            }
            if(three[index] == answers[index]){
                scores[2]++;
            }
        }

        String temp = "";

        int max = 0;

        for(int i =0; i<3; i++){
            if(scores[i]>=max){
                max = scores[i];
            }
        }

        for(int i =0; i<3; i++){
            if(scores[i]==max){
                temp += (i+1) + "";
            }
        }


        int[] answer = Arrays.stream(temp.split("")).mapToInt(Integer::parseInt).toArray();

        return answer;
    }
}
