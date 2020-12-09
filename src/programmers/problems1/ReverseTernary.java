package programmers.problems1;

public class ReverseTernary {
    public int solution(int n) {
        int answer = 0;
        int temp = n;
        int count = 0;
        while (temp>0){
            temp = temp/3;
            count++;
        }
        int digit = count-1;
        while (n>0){
            answer += n%3*Math.pow(3, digit--);
            n = n/3;
        }
        return answer;
    }
}
