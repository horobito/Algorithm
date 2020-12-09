package programmers.problems1;

public class Divisor {
    public int solution(int n) {
        int root = (int)Math.sqrt(n);
        int answer = 0;
        for(int i =root; i>0; i--){
            if(n%i==0){
                if(i*i!=n){
                    answer += i;
                    answer += n/i;
                }else {
                    answer += i;
                }

            }
        }
        return answer;
    }
}

// 중요 개념 : 약수 구하기
// 첫단계 : 루트 이용
// 두번째 : 특수한 경우 구하기
// - 두 수의 제곱
