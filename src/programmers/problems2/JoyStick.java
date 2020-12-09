package programmers.problems2;

public class JoyStick {
    public static void main(String[] args) {
        System.out.println(solution("JEROEN"));;
    }
    public static int solution(String name) {
        int answer = 0;



        int length = name.length();

        int upAndDown = countupAndDown(name, length);
        int leftOrRight = countLeftOrRight(name, length);

        return upAndDown+leftOrRight;
    }

    private static int countLeftOrRight(String name, int length) {


        int maxA = 0;
        int firstAIndex = 0;
        int countA = 0;
        int temp = 0;


        if(length == 1){
            return 0;
        }else {
            for (int i =1; i<length; i++){
                if(name.charAt(i)=='A'){
                    temp++;
                    if(temp>countA){
                        countA = temp;
                        firstAIndex = i-countA+1;
                    }

                }

                if(name.charAt(i)!='A'){
                    temp = 0;
                }

            }
            if(firstAIndex>0 &&firstAIndex-1<countA){
                return (length-1+firstAIndex-1-countA);
            }else {
                return length-1;
            }

        }

    }

    private static int countupAndDown(String name, int length) {

        int count = 0;

        for (int i =0; i<length; i++){
            int charNum = name.charAt(i);

            int a = charNum - 'A';
            if(a<=13){
                count += a;
            }else {
                count += (90 -charNum) +1 ;
            }
        }

        return count;
    }
}
