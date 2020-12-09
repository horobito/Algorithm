package programmers.problems1;

import java.util.Arrays;

public class K_Number {
    public int[] solution(int[] array, int[][] commands) {

        int count = commands.length;


        int[] answer = new int[count];

        for(int i=0; i<count; i++){
            int startIndex = commands[i][0]-1;
            int lastIndex = commands[i][1];
            int selectIndex = commands[i][2]-1;

            int[] temp = Arrays.copyOfRange(array, startIndex, lastIndex);
            Arrays.sort(temp);

            answer[i] = temp[selectIndex];
        }

        return answer;
    }
}
