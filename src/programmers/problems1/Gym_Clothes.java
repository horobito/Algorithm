package programmers.problems1;

public class Gym_Clothes {
    public int solution(int n, int[] lost, int[] reserve) {
        int forgetter = lost.length;


        int forgetterIndex = 0;
        for(int i =0; i<reserve.length; i++){
            for (int j =forgetterIndex; j<lost.length; j++){
                if(reserve[i] - lost[j] == 1 || reserve[i] - lost[j] == -1|| reserve[i] == lost[j] ){
                    forgetter--;
                    forgetterIndex=j+1;
                    break;
                }
            }
        }


        int answer = n-forgetter;
        return answer;
    }
}


