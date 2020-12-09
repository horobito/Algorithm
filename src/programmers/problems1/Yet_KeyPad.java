package programmers.problems1;

public class Yet_KeyPad {
    public static void main(String[] args) {
        int[] arr= {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        solution(arr, "right");
    }
    public static String solution(int[] numbers, String hand) {
        String answer = "";

        int rightThumRow = 1;
        int rightThumColm =3;

        int leftThumRow = 1;
        int leftThumColm = 1;

        int middleRow = 0;



        for(int number : numbers){
            if(number == 1 || number == 4 || number == 7){
                answer += "L";
                leftThumRow = 4-number/3;
                leftThumColm = 1;

            }else if(number == 3 || number == 6 || number == 9){
                answer += "R";
                rightThumRow = 4-number/4;
                rightThumColm = 3;

            }else {
                if(number!=0){
                    middleRow = 4-number/4;
                }else {
                    middleRow = 1;
                }

                double leftLength = Math.sqrt(Math.pow(leftThumRow-middleRow, 2) + Math.pow(leftThumColm-2, 2));
                double rightLength = Math.sqrt(Math.pow(rightThumRow-middleRow, 2) + Math.pow(rightThumColm-2, 2));
                if(leftLength < rightLength){
                    answer += "L";
                    leftThumColm = 2;
                    if(number!=0){
                        leftThumRow = 4-number/3;
                    }else {
                        leftThumRow  = 1;
                    }


                }else if(leftLength > rightLength){
                    answer += "R";
                    rightThumColm = 2;
                    if(number!=0){
                        rightThumRow = 4-number/3;
                    }else {
                        rightThumRow  = 1;
                    }
                }else {
                    if(hand.equals("right")){
                        answer += "R";
                        rightThumColm = 2;
                        if(number!=0){
                            rightThumRow = 4-number/3;
                        }else {
                            rightThumRow  = 1;
                        }
                    }else {
                        answer += "L";
                        leftThumColm = 2;
                        if(number!=0){
                            leftThumRow = 4-number/3;
                        }else {
                            leftThumRow  = 1;
                        }
                    }
                }

            }
        }


        return answer;
    }

}
