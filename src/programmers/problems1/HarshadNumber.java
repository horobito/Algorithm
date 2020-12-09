package programmers.problems1;

public class HarshadNumber {

    public boolean solution(int x) {
        // 자릿수 확인
        boolean answer = true;

        int tempX = x;
        int digit = 0;
        int digitSum = 0;
        while (tempX>0){
            digit++;
            digitSum += tempX%10;
            tempX = tempX/10;
        }

        if((x%digitSum)!=0){
            answer = false;
        }

        return answer;
    }

}
