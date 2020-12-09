package programmers.problems1;

import java.util.ArrayList;

public class Yet_Crane {
    public int solution(int[][] board, int[] moves) {

        int columnLength = board.length;
        int rowLength = board[0].length;
        int basketSize = 0;
        int answer = 0;

        ArrayList<Integer> basket = new ArrayList<>(1);

        for(int i=0; i<moves.length; i++){

            for(int j = columnLength-1; i>0; i--){
                if(board[j][moves[i]-1] != 0){
                    basket.add(board[j][moves[i]-1]);
                    basketSize++;
                    break;
                }
            }

        }

        int[] a = new int[basketSize];

        for(int i =0; i<basketSize; i++){
            a[i] = basket.get(i);
        }

        for(int i =0; i<basketSize-1; i++){
            if(a[i]==a[i+1] && a[i]!=0){
                a[i]=0;
                a[i+1] =0;
            }else if(a[i]!=a[i+1] &&a[i]!=0){
                answer++;
            }

        }

        if(a[basketSize-1]!= a[basketSize-2] && a[basketSize-1] != 0){
            answer++;
        }



        return answer;
    }
}

//            int position = columnLength - moves[i];
//
//           if(board[moves[position]][i] != 0){
//               basket.add(board[position][i]);
//               board[position][i] = 0;
//           }
