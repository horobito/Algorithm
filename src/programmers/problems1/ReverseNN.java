package programmers.problems1;

public class ReverseNN {
    public int[] solution(long n) {
        String a = "" + n;

        String[] temp = Long.toString(n).split("");
        int[] answer = new int[temp.length];
        for(int i=temp.length-1; i>=0; i--){
            answer[temp.length-1-i] = Integer.parseInt(temp[i]);
        }
        return answer;
    }
}
