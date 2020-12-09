package programmers.problems1;

import java.util.*;

public class DartGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result = sc.nextLine();

        System.out.println(solution(result));
    }

    public static int solution(String dartResult) {
        String[] result = dartResult.split("");

        int length = result.length;

        Queue<Integer> scores = new LinkedList<>();
        Queue<String> areasAndPrizes = new LinkedList<>();

        String score = "";
        String areaAndPrize = "";


        for(int i=0; i<length; i++){
            if(result[i].equals("#") ||result[i].equals("*") ){
                areaAndPrize += result[i];
                if(i==length-1){
                    areasAndPrizes.add(areaAndPrize);
                }


            }else if(result[i].equals("S") ||result[i].equals("D") ||result[i].equals("T")){

                scores.add(Integer.parseInt(score));
                score = new String("");
                areaAndPrize += result[i];

                if(i==length-1){
                    areasAndPrizes.add(areaAndPrize);
                }

            }else{

                score += result[i];

                if(scores.size()!=0 && score.length() !=2){
                    areasAndPrizes.add(areaAndPrize);
                    areaAndPrize = new String("");
                }
            }
        }

        double totalScore[] = new double[3];

        for(int i=1; i<=3; i++){
            int a = scores.poll();

            String b = areasAndPrizes.poll();
            if(b.length()>1){
                switch (b.charAt(0)){
                    case 'S':
                        totalScore[i-1] = Math.pow(a, 1);
                        break;
                    case 'D':
                        totalScore[i-1] = Math.pow(a, 2);
                        break;
                    case 'T':
                        totalScore[i-1] = Math.pow(a, 3);
                        break;
                }
                switch (b.charAt(1)){
                    case '*':
                        if(i>1){
                            totalScore[i-2] = totalScore[i-2]*2;
                            totalScore[i-1] = totalScore[i-1]*2;
                        }else {
                            totalScore[i-1] = totalScore[i-1]*2;
                        }
                        break;
                    case '#':
                        totalScore[i-1] = totalScore[i-1]*(-1);
                        break;
                }
            }else {
                switch (b){
                    case "S":
                        totalScore[i-1] = Math.pow(a, 1);
                        break;
                    case "D":
                        totalScore[i-1] = Math.pow(a, 2);
                        break;
                    case "T":
                        totalScore[i-1] = Math.pow(a, 3);
                        break;

                }
            }
        }

        int answer = 0;

        for(int i=0; i<3; i++){
            answer += (int)totalScore[i];
        }

        return answer;
    }
}



