package programmers.problems1;

public class Collatz_conjecture {
    public static void main(String[] args) {
        solution(626331);
    }
    public static int solution(int num) {
        int answer = 0;
        long temp = num;
        while (temp != 1){
            if(answer==501){
                answer = -1;
                break;
            }else {
                answer++;
            }
            temp = (temp%2==0) ? temp/2 : temp*3 +1;

        }
        return answer;
    }
}
