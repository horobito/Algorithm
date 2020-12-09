package programmers.problems1;

public class Invert_String_To_Integer {
    public static void main(String[] args) {
        solution("1234");
    }
    public static int solution(String s) {
        int answer = 0;
        Boolean isPositive = true;

        for(int i=0; i<s.length(); i++){
           char a = s.charAt(i);
           if(a== '-'){
               isPositive = false;
           }else if(a!='+'){
               answer = answer*10 + (a-'0');
           }
        }

        return isPositive? 1* answer :-1 * answer; // 대입 아니면 return
    }
}
