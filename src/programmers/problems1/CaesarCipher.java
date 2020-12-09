package programmers.problems1;

public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            char b = (char)(s.charAt(i) + n);
            if( a==' '){
                answer+=a;
                continue;
            }
            if(b<=90){
                answer += b;
            }else if(a<=90){
                answer += (char)(65+(b-91));
            }else if(b<=122){
                answer += b;
            }else  {
                answer += (char)(97+(b-123)); // char 변환해야 하는것에 주의
            }
        }
        return answer;
    }
}
// 방법 : 아스키 코드 이용
/* 주의사항
1. 문자열에 정수+문자 대입 시, char 변환 주의
2. 범위 주의
3. 아스키 코드 주의 */
