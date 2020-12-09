package programmers.problems1;

public class ArrayHandling {
    public static void main(String[] args) {
        solution("1234");
    }
    public static boolean solution(String s) {
        if(s.length()==4 || s.length()==6){
            for(int i=0; i<s.length(); i++){
                char a = s.charAt(i);
                if (a<'0' || a>'9'){
                    return false;
                }
            }
            return true;
        }
        return false;
        // 변환 시 발생하는 예외를 이용하여  풀이
    }
}
