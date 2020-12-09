package programmers.problems1;

public class MiddleNum {
    public String solution(String s) {
        int length = s.length();

        String answer = "";

        answer = s.substring((length-1)/2 , length/2+1);


        return answer;

    }
}
